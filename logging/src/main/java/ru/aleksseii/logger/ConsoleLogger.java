package ru.aleksseii.logger;

import org.jetbrains.annotations.NotNull;

public final class ConsoleLogger extends Logger {

    private final org.apache.logging.log4j.Logger logger =
            org.apache.logging.log4j.LogManager.getLogger(this);

    @Override
    public void log(@NotNull String message) {
        logger.info(linesCounter++ + " " + message);
    }
}
