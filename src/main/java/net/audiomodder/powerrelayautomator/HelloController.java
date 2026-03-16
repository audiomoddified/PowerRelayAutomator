package net.audiomodder.powerrelayautomator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public ComboBox relayUsbValue;
    @FXML
    public Button relayInitializeButton;
    @FXML
    public TextField relayStateField;

    @FXML
    public ComboBox receiverUsbValue;
    @FXML
    public Button receiverInitializeButton;
    @FXML
    public TextField receiverStateField;

    @FXML
    public TextField fileLocationString;
    @FXML
    public Button openFileChooserButton;
    @FXML
    public Button initializeLogButton;

    @FXML
    public Button beginStopButton;

}
