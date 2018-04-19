/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ahmed
 */
public class VIEW_ConcoursController implements Initializable {

    @FXML
    private Button btnpar;
    @FXML
    private Button btngere;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if (IHM_loginController.membre == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ti connectiiii");
            // alert.setHeaderText(null);
            alert.setContentText("veuillez vous connecter");
            alert.showAndWait();
        } else {
            if (IHM_loginController.membre.getType().equals("membre")) {
                btnpar.setVisible(true);

            } else {
                if (IHM_loginController.membre.getType().equals("Admin")) {
                    btngere.setVisible(true);
                    btnpar.setVisible(true);
                }

            }
        }

    }

    @FXML
    private void participation(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("IHM_Liste_Concour_Parti.fxml"));//IHM_Liste_Concour_Parti..VIEW_Gerer_Concours
        } catch (IOException ex) {
            Logger.getLogger(VIEW_ConcoursController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void gerer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VIEW_Gerer_Concours.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
