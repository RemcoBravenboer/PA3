package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nVal;

    public void qpCalc(){
        int nValue = Integer.parseInt(nVal.getText());
    }
}
