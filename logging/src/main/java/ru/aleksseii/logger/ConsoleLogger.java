package ru.aleksseii.logger;

public final class ConsoleLogger implements Logger {

    private final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(ConsoleLogger.class.getName());

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
    }

    @Override
    public void log(long lineNumber, String message) {
        logger.info(lineNumber + " " + message);
    }
}
