package net.audiomodder.powerrelayautomator.devices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {

    private static final String FILE_HEADER = "";

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;

    private final Path filePath;

    public FileLogger(Path filePath) {
        this.filePath = filePath;
        writeToFile(FILE_HEADER);
    }

    public void addToLog(double temperature, Boolean lampState) {
        writeToFile(formatString(temperature, lampState));
    }

    private String formatString(double temperature, Boolean lampState) {
        return getFormattedDateTime() + "," +
                formatTempString(temperature) + "," +
                formatLampState(lampState);
    }

    private String getFormattedDateTime() {
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    private String formatTempString(double temperature) {
        return String.format("%.2f", temperature);
    }

    private String formatLampState(Boolean lampState) {
        return lampState ? "ON" : "OFF";
    }

    private void writeToFile(String stringToWrite) {
        try {
            Files.writeString(filePath, stringToWrite);
        } catch (IOException e) {
            //TODO: Handle more elegantly
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}
