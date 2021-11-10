package com.example.billingsystem.Controllers;

import com.example.billingsystem.Database.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button registerBtn;
    @FXML
    private Label loginMessageTxt;
    @FXML
    private ImageView billingSystemLoginImg;
    @FXML
    private ImageView lockModeImg;
    @FXML
    private TextField usernameEdtxt;
    @FXML
    private TextField passwordEdtxt;

    public void loginBtnOnAction(ActionEvent event){
        if(!usernameEdtxt.getText().isBlank() && !passwordEdtxt.getText().isBlank()){
            loginMessageTxt.setText("You are trying to login");
            validateLogin();
        }
        else{
            loginMessageTxt.setText("Please enter username and password");
        }
    }

    public void registerBtnOnAction(ActionEvent event){
        Stage stage = (Stage) registerBtn.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile = new File("C:\\Users\\KEDS30682\\Desktop\\BillingSystemJavaFX\\src\\main\\resources\\com\\example\\billingsystem\\images\\EntryImage.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        billingSystemLoginImg.setImage(brandingImage);

        File lockFile = new File("C:\\Users\\KEDS30682\\Desktop\\BillingSystemJavaFX\\src\\main\\resources\\com\\example\\billingsystem\\images\\lock-icon.png");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockModeImg.setImage(lockImage);

    }

    public void validateLogin(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connectionDB = databaseConnection.getConnection();

        String verifyLogin = "SELECT count(1) FROM user_account WHERE username = ' " + usernameEdtxt.getText() + " ' AND password ' " + passwordEdtxt.getText() + " ' ";

    }
}



