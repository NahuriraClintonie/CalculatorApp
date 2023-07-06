package org.pahappa.systems.calculatormain.views;

// import org.pahappa.systems.calculatormain.services.CalculatorService;
// import org.pahappa.systems.calculatormain.services.impl.CalculatorServiceImpl;

import java.util.Scanner;
import java.util.InputMismatchException;


public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public int displayMenuAndGetChoice() {
        System.out.println("****Calculator Menu****");
        System.out.println("\t1. Divide");
        System.out.println("\t2. Subtract");
        System.out.println("\t3. Exit\n");
        System.out.print("Enter your choice: ");

        int choice;
        while (true) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                System.out.println();
                scanner.nextLine(); // Consume the invalid input
            }
        }

        return choice;
    }

    public double[] getNumbers() {
        double[] numbers = new double[2];
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the first number: ");

            try {
                numbers[0] = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        validInput = false;

        while (!validInput) {
            System.out.print("Enter the second number: ");

            try {
                numbers[1] = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return numbers;
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
