package ru.aleksseii.logger;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public final class FileLogger extends Logger {

    private final org.apache.logging.log4j.Logger logger =
            org.apache.logging.log4j.LogManager.getLogger(this);

    private final String tag;

    public FileLogger(String tagName) {
        this.tag = "<" + tagName + ">%s</" + tagName + ">";
        logDateTime(LocalDateTime.now());
    }

    @Override
    public void log(@NotNull String message) {
        logger.info(linesCounter++ + " " + String.format(this.tag, message));
    }

    private void logDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        logger.info("\n" + formatter.format(dateTime));
    }
}
