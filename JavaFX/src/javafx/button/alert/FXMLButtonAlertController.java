/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.button.alert;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author djs
 */
public class FXMLButtonAlertController implements Initializable {

    @FXML
    private Button button;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    public void clicarBotaoMostrarAlert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Este é o titulo do Alerta");
        alert.setHeaderText("Este é o cabeçalho  do Alerta");
        alert.setContentText("Você clicou no botão ");
        alert.show();
        
        
        
        
        
    
    }
    
}
