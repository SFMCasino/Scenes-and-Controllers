/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author XeroFox
 */
public class Globalis {
    void LoadScene(ActionEvent event,String ID, String hova) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Casino" + hova + ".fxml"));
        Parent root = (Parent) loader.load();
        
        switch(hova){
            case "SlotII":
                CasinoSlotIIController menu1 = loader.getController();
                menu1.Adatatvitel(ID);
                break;
            case "SlotI":
                CasinoSlotIController menu2 = loader.getController();
                menu2.Adatatvitel(ID);
                break;
            case "Coin":
                CasinoCoinController menu3 = loader.getController();
                menu3.Adatatvitel(ID);
                break;
            case "Dice":
                CasinoDiceController menu4 = loader.getController();
                menu4.Adatatvitel(ID);
                break;
            case "Wheel":
                CasinoWheelController menu5 = loader.getController();
                menu5.Adatatvitel(ID);
                break;
            case "Roulette":
                CasinoRouletteController menu6 = loader.getController();
                menu6.Adatatvitel(ID);
                break;
            case "Feltoltes":
                CasinoFeltoltesController menu7 = loader.getController();
                menu7.Adatatvitel(ID);
                break;
            case "Bolt":
                CasinoBoltController menu8 = loader.getController();
                menu8.Adatatvitel(ID);
                break;
            case "Profile":
                CasinoProfileController menu9 = loader.getController();
                menu9.Adatatvitel(ID);
                break;
            case "Fomenu":
                CasinoFomenuController menu10 = loader.getController();
                menu10.Adatatvitel(ID);
                break;
            case "BJ":
                CasinoBJController menu11 = loader.getController();
                menu11.Adatatvitel(ID);
                break;
            default:
                break;
        }
        

        Scene ViewScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    String[] checkGenderID(String nem,String haj,String szem){
        String[] genderID = {"",""};
        if(nem.equals("Férfi")){
            genderID[0] = "0";
            switch(haj){
                case "Barna":
                    switch(szem){
                        case "Arany":
                            genderID[1] = "0";
                            break;
                        case "Barna":
                            genderID[1] = "4";
                            break;
                        case "Kék":
                            genderID[1] = "8";
                            break;
                        case "Zöld":
                            genderID[1] = "12";
                            break;
                        default:
                            break;
                    }
                case "Fekete":
                    switch(szem){
                        case "Arany":
                            genderID[1] = "16";
                            break;
                        case "Barna":
                            genderID[1] = "20";
                            break;
                        case "Kék":
                            genderID[1] = "24";
                            break;
                        case "Zöld":
                            genderID[1] = "28";
                            break;
                        default:
                            break;
                    }
                case "Szöke":
                    switch(szem){
                        case "Arany":
                            genderID[1] = "32";
                            break;
                        case "Barna":
                            genderID[1] = "36";
                            break;
                        case "Kék":
                            genderID[1] = "40";
                            break;
                        case "Zöld":
                            genderID[1] = "44";
                            break;
                        default:
                            break;
                    }
            }
        }else if(nem.equals("Nő")){
            genderID[0] = "1";
            switch(haj){
                case "Barna":
                    switch(szem){
                        case "Arany":
                            genderID[1] = "0";
                            break;
                        case "Barna":
                            genderID[1] = "5";
                            break;
                        case "Kék":
                            genderID[1] = "10";
                            break;
                        case "Zöld":
                            genderID[1] = "15";
                            break;
                        default:
                            break;
                    }
                case "Fekete":
                    switch(szem){
                        case "Arany":
                            genderID[1] = "20";
                            break;
                        case "Barna":
                            genderID[1] = "25";
                            break;
                        case "Kék":
                            genderID[1] = "30";
                            break;
                        case "Zöld":
                            genderID[1] = "35";
                            break;
                        default:
                            break;
                    }
                case "Szöke":
                    switch(szem){
                        case "Arany":
                            genderID[1] = "40";
                            break;
                        case "Barna":
                            genderID[1] = "45";
                            break;
                        case "Kék":
                            genderID[1] = "50";
                            break;
                        case "Zöld":
                            genderID[1] = "55";
                            break;
                        default:
                            break;
                    }
            }
        }
        return genderID;
    }
}
