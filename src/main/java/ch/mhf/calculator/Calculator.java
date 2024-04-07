package ch.mhf.calculator;

/*
Um für zukünftige Erweiterungen der Grundrechenarten gerüstet zu sein, soll der Rechner so umgebaut werden,
dass er das Strategie-Muster zur Auswahl der gewünschten Operation nutzt. Implementieren Sie eine
entsprechende Klasse StrategyCalculator mit den zugehörigen Hilfsklassen und Interfaces.
 */

interface CalculatorStrategy {     // 2 Punkte für korrektes Interface
    int calculate(int i1, int i2);
}

class AddingCalculatorStrategy implements CalculatorStrategy {  // 2 Punkte
    @Override    // optional
    public int calculate(int i1, int i2) {
        return i1 + i2;
    }

}

class MultiplicatingCalculatorStrategy implements CalculatorStrategy {  // 2 Punkte
    @Override
    public int calculate(int i1, int i2) {
        return i1 * i2;
    }
}

public class Calculator  {

    int calculateByStategy(int i1, int i2, CalculatorStrategy strategy) {  // 1 Punkt
        return strategy.calculate(i1, i2);                // 1 Punkt
    }

    public static void main(String[] args) {         // 2 Punkte für komplette main
        Calculator c = new Calculator();
        System.out.println("1+2 = "+c.calculateByStategy(1, 2, new AddingCalculatorStrategy()));
        System.out.println("2*3 = "+c.calculateByStategy(2, 3, new MultiplicatingCalculatorStrategy()));
    }
}