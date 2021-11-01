package ku.cs.controllers;

import javafx.event.ActionEvent;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class MainControllers {

    public void handleStartButton() {
        try {
            FXRouter.goTo("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
