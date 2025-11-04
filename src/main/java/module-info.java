module net.audiomodder.powerrelayautomator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens net.audiomodder.powerrelayautomator to javafx.fxml;
    exports net.audiomodder.powerrelayautomator;
}