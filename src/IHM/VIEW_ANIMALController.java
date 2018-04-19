/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ahmed
 */
public class VIEW_ANIMALController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onClickAdoption(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("IHM_Adoption.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void onClickConsulter_Animal(ActionEvent event) throws IOException {
        if (IHM_loginController.membre != null) {
            Parent root = FXMLLoader.load(getClass().getResource("IHM_AjouterAnimal.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("veuillez vous connecter");
            alert.show();
        }

    }

    @FXML
    private void onClickSOSDisparition(ActionEvent event) throws IOException {
        if (IHM_loginController.membre != null) {
            Parent root = FXMLLoader.load(getClass().getResource("IHM_SosDisparition.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("veuillez vous connecter");
            alert.show();
        }
        /*if (IHM_loginController.membre != null) {
            Parent root = FXMLLoader.load(getClass().getResource("IHM_List_Sos.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("veuillez vous connecter");
            alert.show();
        }*/
    }

}
