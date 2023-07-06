package org.pahappa.systems.calculatormain;
import org.pahappa.systems.calculatormain.services.CalculatorService;
import org.pahappa.systems.calculatormain.models.CalculatorModel;
import org.pahappa.systems.calculatormain.views.CalculatorView;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel(0, 0);
        CalculatorView view = new CalculatorView();
        CalculatorService service = new CalculatorService(model, view);

        service.start();
    }
}