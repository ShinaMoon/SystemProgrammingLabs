package OldLabs;

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
    private Button buttonLab1;

    private WinHelper wh = new WinHelper();


    @FXML
    void openLab1(MouseEvent event) {

        wh.openWindow("/OldLabs/Lab1Window.fxml");
    }

    @FXML
    void initialize() {

    }
}
