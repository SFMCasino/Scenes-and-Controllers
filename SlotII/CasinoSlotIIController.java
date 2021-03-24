/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author XeroFox
 */
public class CasinoSlotIIController implements Initializable {
    
    @FXML
    void MenuCloseButton(ActionEvent event){
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }
    
    @FXML
    void MenuKijelentkezesButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoLogin.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuRouletteButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoRoulette.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    @FXML
    void MenuFooldalGomb(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoFomenu.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    @FXML
    void MenuProfileButton(ActionEvent event) throws IOException {
        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoProfile.fxml"));
        Scene ProfileViewScene = new Scene(ProfileViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ProfileViewScene);
        window.show();
    }
    
    @FXML
    void MenuBJButton(ActionEvent event) throws IOException {
        Parent BJViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoBJ.fxml"));
        Scene BJViewScene = new Scene(BJViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BJViewScene);
        window.show();
    }

    @FXML
    void MenuBoltButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoBolt.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuCoinButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoCoin.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuDiceButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoDice.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuFeltoltesButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoFeltoltes.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuSlotIButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoSlotI.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuWheelButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoWheel.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
