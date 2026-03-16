package net.audiomodder.powerrelayautomator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.audiomodder.powerrelayautomator.devices.FileLogger;
import net.audiomodder.powerrelayautomator.devices.PowerRelay;
import net.audiomodder.powerrelayautomator.devices.TempReader;

import java.io.IOException;

public class HelloApplication extends Application {

    private static final String WINDOW_TITLE = "Power Relay Automator";

    private PowerRelay powerRelay = null;
    private TempReader tempReader = null;
    private FileLogger fileLogger = null;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 460, 300);
        stage.setTitle(WINDOW_TITLE);
        stage.setScene(scene);
        stage.show();
    }
}
