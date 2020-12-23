package ch.mhf.fileHandling;

import java.io.File;

public class ReadFileInformationen
{
    public static void main(String[] args)
    {
        File myFile = new File("Filename.txt");

        if (myFile.exists())
        {
            System.out.println("File name: " + myFile.getName());           //output Filename.txt
            System.out.println("Absolut path: " + myFile.getAbsolutePath());//output /home/mhf/Git/Java/cheatSheet_java/Filename.txt
            System.out.println("Writeable: " + myFile.canWrite());          //output true
            System.out.println("Readable: " + myFile.canRead());            //output true
            System.out.println("File size in bytes: " + myFile.length());   //output 36
        } else {
            System.out.println("The file does not exists.");
        }
    }
}
