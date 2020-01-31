package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import winWorkHelperLib.WinHelper;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonOpenLab2;

    @FXML
    private Button buttonOpenOldLab;

    @FXML
    private Button buttonExit;

    private WinHelper wh = new WinHelper();

    @FXML
    void exitProgram(MouseEvent event) {
        // Закрываем окно в  котором находится кнопка
        buttonExit.getScene().getWindow().hide();
    }

    @FXML
    void openLab2(MouseEvent event) {

        wh.openWindow("/sample/lab2Window.fxml");
    }

    @FXML
    void openOldLab(MouseEvent event) {

        wh.openWindow("/OldLabs/MainWindow.fxml");

    }

    @FXML
    void initialize() {

    }
}
