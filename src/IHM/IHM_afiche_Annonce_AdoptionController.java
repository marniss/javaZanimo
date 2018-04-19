/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import entites.Adoption;
import entites.Animal;
import entites.Membre;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import services.ControlleurAnimal;
import services.ControlleurMembre;

/**
 * FXML Controller class
 *
 * @author houssem
 */
public class IHM_afiche_Annonce_AdoptionController implements Initializable {

    @FXML
    private ImageView imageANimal;
    @FXML
    private Label race;
    @FXML
    private Label typeAnnonce;
    @FXML
    private Label ageanimal;
    @FXML
    private Label Adresse;
    @FXML
    private Text Description;
    @FXML
    private Label contact;
    @FXML
    private AnchorPane nomAnnonceur;
    @FXML
    private Label labelanonceur;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Adoption adoption = IHM_Adoption_afficherController.adop;
        Adresse.setText(adoption.getLieu());
        typeAnnonce.setText(adoption.getType());
        Description.setText(adoption.getDescription());
        ControlleurAnimal ca = new ControlleurAnimal();
        Animal a = ca.getAnimal(IHM_Adoption_afficherController.adop.getIdAnimal());
        race.setText(a.getRace());
        ageanimal.setText("" + a.getDate_naissance());
        ControlleurMembre cm = new ControlleurMembre();
        Membre m = cm.getMembre(IHM_Adoption_afficherController.adop.getIdMembre());
        labelanonceur.setText(m.getNom());
    }

    @FXML
    private void retour(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IHM_Adoption_afficher.fxml"));

        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    @FXML
    private void annuler(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void contacterAnonceur(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IHM_contacter_annonce_Adoption.fxml"));

        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(new Scene(root1));
        stage.show();

    }

}
