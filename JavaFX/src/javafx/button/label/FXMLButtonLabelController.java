/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.button.label;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author djs
 */
public class FXMLButtonLabelController implements Initializable {
    
    
    @FXML
    private Button button;
    
    @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void clicarBotaoMostrarLabel(){
        label.setText("Clicou no botão!");
    }
    
}
