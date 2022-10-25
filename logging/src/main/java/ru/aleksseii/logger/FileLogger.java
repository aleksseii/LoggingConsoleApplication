package ru.aleksseii.logger;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public final class FileLogger extends Logger {

    private final @NotNull org.apache.logging.log4j.Logger logger;

    private final @NotNull String tag;

    @Inject
    public FileLogger(@NotNull org.apache.logging.log4j.Logger logger,
                      @NotNull String tagName) {

        this.logger = logger;
        this.tag = "<" + tagName + ">%s</" + tagName + ">";
        logDateTime(LocalDateTime.now());
    }

    @Override
    public void log(@NotNull String message) {
        logger.info(linesCounter++ + " " + String.format(this.tag, message));
    }

    private void logDateTime(@NotNull LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        logger.info("\n" + formatter.format(dateTime));
    }
}
