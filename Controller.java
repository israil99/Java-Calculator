package Calculators;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton nine;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton pointBtn;

    @FXML
    private JFXButton minusBtn;

    @FXML
    private JFXButton one;

    @FXML
    private JFXButton seven;

    @FXML
    private JFXButton percent;

    @FXML
    private JFXButton three;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton equalBtn;

    @FXML
    private JFXButton clearAll;

    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXButton eight;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton divideBtn;

    @FXML
    private JFXButton changeBtn;

    @FXML
    private JFXButton clearChar;

    @FXML
    private JFXButton four;

    @FXML
    private JFXButton multiplyBtn;

    @FXML
    private JFXTextField txtField = new JFXTextField();
    @FXML
    private JFXButton five;
    private double fnumber;
    private double snumber;
    private String operation;
    private double result;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void pointBtn_click(){
        if(! txtField.getText().contains(".")&&!txtField.getText().contains(","))
        {
            txtField.setText(txtField.getText()+pointBtn.getText());
        }

    }
    public void oneBtn_click(){
        String oldValue = txtField.getText();
        String set = "1";
        txtField.setText(oldValue+set);
    }
    public void twoBtn_click(){

        String oldValue = txtField.getText();
        String set = "2";
        txtField.setText(oldValue+set);
    }
    public void threeBtn_click(){

        String oldValue = txtField.getText();
        String set = "3";
        txtField.setText(oldValue+set);
    }
    public void fourBtn_click(){
        String oldValue = txtField.getText();
        String set = "4";
        txtField.setText(oldValue+set);

    }
    public void fiveBtn_click(){
        String oldValue = txtField.getText();
        String set = "5";
        txtField.setText(oldValue+set);
    }
    public void sixBtn_click(){
        String oldValue = txtField.getText();
        String set = "6";
        txtField.setText(oldValue+set);
    }
    public void sevenBtn_click(){
        String oldValue = txtField.getText();
        String set = "7";
        txtField.setText(oldValue+set);
    }
    public void eightBtn_click(){
        String oldValue = txtField.getText();
        String set = "8";
        txtField.setText(oldValue+set);
    }
    public void nineBtn_click(){
        String oldValue = txtField.getText();
        String set = "9";
        txtField.setText(oldValue+set);
    }
    public void zeroBtn_click(){
        String oldValue = txtField.getText();
        String set = "0";
        txtField.setText(oldValue+set);
    }
    public void multiplyBtn_click(){
        fnumber = Double.parseDouble(txtField.getText());
        txtField.setText("");
        operation="*";
    }
    public void divideBtn_click(){
        fnumber = Double.parseDouble(txtField.getText());
        txtField.setText("");
        operation="/";

    }
    public void addBtn_click(){
        fnumber = Double.parseDouble(txtField.getText());
        txtField.setText("");
        operation="+";
    }
    public void minusBtn_click(){
        fnumber = Double.parseDouble(txtField.getText());
        txtField.setText("");
        operation="-";

    }
    public void changeBtn_click(){
        double ops = Double.parseDouble(String.valueOf(txtField.getText()));
        ops = ops*(-1);
        txtField.setText(String.valueOf(ops));

    }
    public void clearAllBtn_click(){
        txtField.setText("");
        this.fnumber=0;
        this.snumber=0;

    }
    public void clearCharBtn_click() {
        String backspace = null;
        if (txtField.getText().length() > 0) {
            StringBuilder sb = new StringBuilder((txtField.getText()));
            sb.deleteCharAt(txtField.getText().length() - 1);
            backspace = sb.toString();
            txtField.setText(backspace);
        }
    }
        public void percentBtn_click () {
            fnumber = Double.parseDouble(txtField.getText());
            txtField.setText("");
            operation="%";
        }


        public void equalBtn_click () {

            String answer;


            switch (operation) {
                case "+":
                    snumber = Double.parseDouble(txtField.getText());
                    result = fnumber + snumber;
                    answer = String.format("%.2f", result);
                    txtField.setText(answer);
                    break;

                case "-":
                    snumber = Double.parseDouble(txtField.getText());
                    result = fnumber - snumber;
                    answer = String.format("%.2f", result);
                    txtField.setText(answer);
                    break;
                case "*":
                    snumber = Double.parseDouble(txtField.getText());
                    result = fnumber * snumber;
                    answer = String.format("%.2f", result);
                    txtField.setText(answer);
                    break;
                case "/":
                    snumber = Double.parseDouble(txtField.getText());
                    result = fnumber * snumber;
                    answer = String.format("%.2f", result);
                    txtField.setText(answer);
                    break;
                case "%":
                    snumber = Double.parseDouble(txtField.getText());
                    result = fnumber % snumber;
                    answer = String.format("%.2f", result);
                    txtField.setText(answer);
                    break;


            }
        }

    }




