package ru.aleksseii.logger;

import org.apache.logging.log4j.LogManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public final class FileLogger implements Logger {

    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(this);

    @Override
    public void log(long lineNumber, String message) {
        logger.info(lineNumber + " " + message);
    }

    public void logDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        logger.info("\n" + formatter.format(dateTime));
    }
}
