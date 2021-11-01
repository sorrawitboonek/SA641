package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class ProductController {

    @FXML
    private MenuButton userMenuButton;

    @FXML
    private ImageView userImageView;

    @FXML
    void handleLogoutButton() {
        try {
            FXRouter.goTo("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
