package org.pahappa.systems.calculatormain.services;

import org.pahappa.systems.calculatormain.models.CalculatorModel;
import org.pahappa.systems.calculatormain.views.CalculatorView;

public class CalculatorService {
    private CalculatorModel model;
    private CalculatorView view;

    // Constructor
    public CalculatorService(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    // Perform the appropriate calculation based on user choice
public void performCalculation(int choice) {
    if (choice == 3) {
        System.out.println("Exiting the calculator...");
        System.exit(0);
    }

    double[] numbers = view.getNumbers();
    model = new CalculatorModel(numbers[0], numbers[1]);

    switch (choice) {
        case 1:
            model.division();
            break;
        case 2:
            model.subtract();
            break;
        default:
            System.out.println("Invalid choice.");
            return;
    }

    double result = model.getResult();
    view.displayResult(result);
}

    // Start the calculator
public void start() {
    int choice;

    do {
        choice = view.displayMenuAndGetChoice();
        performCalculation(choice);
    } while (choice != 3);
}
    
}
