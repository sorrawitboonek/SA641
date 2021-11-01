package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class SalesControllers {

    @FXML
    private MenuButton userMenuButton;

    @FXML
    private ImageView userImageView;

    @FXML
    private VBox orderVbox;

    @FXML
    void handleLogoutButton() {
        try {
            FXRouter.goTo("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
