package winWorkHelperLib;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class WinHelper {
    public void openWindow(String path) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));

        // "/sample/MainWindow.fxml"

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
