package ku.cs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.github.saacsos.FXRouter;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXRouter.bind(this, stage, "Italy");
        configRoute();
        FXRouter.goTo("main");
    }

    private static void configRoute() {
        String packageStr = "ku/cs/fxml/";
        FXRouter.when("main", packageStr+"main.fxml");
        FXRouter.when("login",packageStr+"login.fxml");
        FXRouter.when("register",packageStr+"register.fxml");
        FXRouter.when("product",packageStr+"product.fxml");
        FXRouter.when("sales",packageStr+"sales.fxml");
        //FXRouter.when("",packageStr+".fxml");
    }

    public static void main(String[] args){
        launch();
    }


}