package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ku.cs.service.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterController {

    PreparedStatement preparedStatement;
    DatabaseConnection connectNow = new DatabaseConnection();
    Connection connection = connectNow.getConnection();

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
        //insert
        try{
            preparedStatement = connection.prepareStatement("INSERT INTO Customer(customer_username,customer_password,customer_address,customer_tel,customer_email,customer_name) VALUES (?,?,?,?,?,?)");
            preparedStatement.setString(1,"Customer1");
            preparedStatement.setString(2,"11111111");
            preparedStatement.setString(3,"11/11 BKK 10000");
            preparedStatement.setString(4,"0911111111");
            preparedStatement.setString(5,"Customer1@mail.com");
            preparedStatement.setString(6,"Customer One");
            int status = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
