package ch.mhf.klassen_interface;

/*
    The following example, HelloWorldAnonymousClasses, uses anonymous classes in the initialization statements of the
    local variables frenchGreeting and spanishGreeting, but uses a local class for the initialization of the variable
    englishGreeting.
 */

public class AnonymousClass
{
    interface HelloWorld
    {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello()
    {

        class EnglishGreeting implements HelloWorld
        {
            String name = "world";
            public void greet()
            {
                greetSomeone("world");
            }
            public void greetSomeone(String someone)
            {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld()
        {
            String name = "tout le monde";
            public void greet()
            {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone)
            {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld()
        {
            String name = "mundo";
            public void greet()
            {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone)
            {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Michael");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        AnonymousClass myApp = new AnonymousClass();
        myApp.sayHello();
    }
}
