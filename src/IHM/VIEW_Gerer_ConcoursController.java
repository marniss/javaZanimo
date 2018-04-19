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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ahmed
 */
public class VIEW_Gerer_ConcoursController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void listingconcours(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("IHM_Liste_Concour.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        /*         Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("IHM_Liste_Concour_Parti.fxml"));//IHM_Liste_Concour_Parti..VIEW_Gerer_Concours
        } catch (IOException ex) {
            Logger.getLogger(VIEW_ConcoursController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();*/
    }

    @FXML
    private void listingparticipation(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("IHM_Gerer_Participation.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
