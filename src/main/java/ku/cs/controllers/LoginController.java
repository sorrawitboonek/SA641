package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ku.cs.model.Userlist;
import ku.cs.service.UserHardcodeDataSource;

import java.io.IOException;

public class LoginController {
    private UserHardcodeDataSource userData;
    private Userlist users;

    @FXML
    private PasswordField userPasswordField;

    @FXML
    private TextField userNameTextField;

    @FXML
    private Button signinUserButton;

    @FXML
    private Label signupLabel;

    @FXML public void initialize(){
        userData = new UserHardcodeDataSource();
        users = userData.readData();
    }

    @FXML
    void handleGoRegisterButton() {
        try {
            com.github.saacsos.FXRouter.goTo("register");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void handleLoginButton() {

    }
}
