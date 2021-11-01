package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegisterController {
    @FXML
    private Button goSigninButton;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField cfPasswordField;

    @FXML
    private Button signupUserButton;

    @FXML
    private TextField telTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField shippingAddressTextfield;

    @FXML
    private Label ifSignUpLabel;

    @FXML
    void checkPasswordIsDifferent() {

    }

    @FXML
    void checkPasswordMustBeEight() {

    }

    @FXML
    void checkUsernameAlreadyUsed() {

    }

    @FXML
    void handleGoLoginButton() {
        try {
            com.github.saacsos.FXRouter.goTo("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleRegisterButton() {

    }
}
