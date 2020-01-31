package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import winWorkHelperLib.WinHelper;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class lab2WindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn;

    @FXML
    void click(MouseEvent event) {

        // Закрываем окно в  котором находится кнопка
        btn.getScene().getWindow().hide();

        WinHelper wh = new WinHelper();
        wh.openWindow("/sample/MainWindow.fxml");
    }

    @FXML
    void initialize() {

    }
}
