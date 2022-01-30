package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import model.CalculatorModel;
import util.Alerts;
import javafx.scene.control.Button;

public class CalculatorController {

    @FXML
    private Label resultLabel;

    private double number1 = 0;
    private String operator = "";
    private boolean start = true;

    private CalculatorModel model = new CalculatorModel();

    @FXML
    void processNumber(ActionEvent event) {
        if(start) {
            resultLabel.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        resultLabel.setText(resultLabel.getText() + value);
    }

    @FXML
    void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if(!value.equals("=")) {
            if(!operator.isEmpty()) {
                Alerts.showAlert(AlertType.WARNING, "Aviso", 
                "Dupla tentativa de uso de operador", 
                "O primeiro operador escolhido será efetuado");
                return;
            }
            operator = value;
            number1 = Double.parseDouble(resultLabel.getText());
            resultLabel.setText("");
        }
        else {
            if(operator.isEmpty())
                return;
            if(!operator.isEmpty() && resultLabel.getText().length() == 0) {
                Alerts.showAlert(AlertType.WARNING, "Aviso", 
                    "Segundo operando faltando", 
                    "Forneça o segundo operando");
                return;
            }
                
            double number2 = Double.parseDouble(resultLabel.getText());
            double output = 0.0;
            try {
                output = model.calculate(number1, number2, operator);
            }
            catch(ArithmeticException e) {
                Alerts.showAlert(AlertType.ERROR, "Erro", 
                    "Tentativa de Divisão por zero", 
                    "Forneça um denominador diferente de zero");
                resultLabel.setText(String.valueOf(number1));
                operator = "";
                return;
            }
            
            resultLabel.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }

}


