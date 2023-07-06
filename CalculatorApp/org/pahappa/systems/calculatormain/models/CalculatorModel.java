package org.pahappa.systems.calculatormain.models;

public class CalculatorModel {
    private double number1;
    private double number2;
    private double result;

    // Constructor
    public CalculatorModel(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Perform multiplication
    public void division() {
        result = number1 / number2;
    }

    // Perform subtraction 
    public void subtract() {
        result = number1 - number2;
    }

    // Get the result
    public double getResult() {
        return result;
    }
}
