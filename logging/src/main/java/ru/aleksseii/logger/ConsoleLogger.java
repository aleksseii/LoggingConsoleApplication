package ru.aleksseii.logger;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

public final class ConsoleLogger extends Logger {

    private final @NotNull org.apache.logging.log4j.Logger logger;

    @Inject
    public ConsoleLogger(@NotNull org.apache.logging.log4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(@NotNull String message) {
        logger.info(linesCounter++ + " " + message);
    }
}
