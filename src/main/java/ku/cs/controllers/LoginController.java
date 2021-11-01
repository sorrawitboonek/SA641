package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import ku.cs.model.Userlist;
import ku.cs.service.UserHardcodeDataSource;
import com.github.saacsos.FXRouter;

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
        if (userNameTextField.getText().equals("Admin")) {
            users.login(userNameTextField.getText(), userPasswordField.getText());
            try {
                FXRouter.goTo("sales");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(users.login(userNameTextField.getText(),userPasswordField.getText())) {
            try {
                FXRouter.goTo("product");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("Invalid Username or Password ");
            alert.setContentText("Please input valid username or password");
            alert.showAndWait();
        }
    }
}
