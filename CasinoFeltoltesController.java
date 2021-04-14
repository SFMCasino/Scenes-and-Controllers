/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author XeroFox
 */
public class CasinoFeltoltesController implements Initializable {

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

    public void MenuSlotIIButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoSlotII.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    private Label BankMoney,ChipMoney,getID,kozlLabel;
    public Button paypalButt, bankButt;
    public TextField cardText, cardpenzText, expText, bankpenzText;
    public PasswordField cvcText;
    public Pane cardPane, bankPane;


    String id = "";

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
    public void Adatatvitel(String ID){
        String kisid = ID;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.home") + File.separator + (ID+".txt")))){
            String[] penzek = bufferedReader.readLine().split(":");
            getID.setText(kisid);
            BankMoney.setText(penzek[0]);
            ChipMoney.setText(penzek[1]);
        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }
        
    }



    public void bankButtPressed(ActionEvent actionEvent)
    {
        bankPane.setVisible(true);
        cardPane.setVisible(false);
    }

    public void cardButtPressed(ActionEvent actionEvent)
    {
        bankPane.setVisible(false);
        cardPane.setVisible(true);
    }
}
