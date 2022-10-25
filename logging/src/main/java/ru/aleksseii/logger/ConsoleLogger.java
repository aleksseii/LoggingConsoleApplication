package ru.aleksseii.logger;

import org.jetbrains.annotations.NotNull;

public final class ConsoleLogger extends Logger {

    private final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(ConsoleLogger.class.getName());

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
    }

    @Override
    public void log(@NotNull String message) {
        logger.info(linesCounter++ + " " + message);
    }
}
