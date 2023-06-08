package com.example.javafx_03;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class HelloController {
    @FXML
    private TextField txtNumber1;
    @FXML
    private TextField txtNumber2;
    @FXML
    private Label labelResult;
    @FXML
    private Button btSum;

    @FXML
    private Label welcomeText;

    @FXML
    public void onBtSumAction(){
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double sum = number2 + number1;
            labelResult.setText(String.format("%.2f", sum));
        }
        catch (NumberFormatException e){
            Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType.ERROR);

        }
    }



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bem vindo a aplicação de layouts Java!");

        Alerts.showAlert("Alert Title", "Alert header", "Oieeee", Alert.AlertType.INFORMATION);

    }


}