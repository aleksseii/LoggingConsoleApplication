package ru.aleksseii.logger;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

public final class CompositeLogger extends Logger {

    private final Logger consoleLogger;

    private final Logger fileLogger;

    @Inject
    public CompositeLogger(@NotNull Logger consoleLogger,
                           @NotNull Logger fileLogger) {

        this.consoleLogger = consoleLogger;
        this.fileLogger = fileLogger;
    }

    @Override
    public void log(@NotNull String message) {
        consoleLogger.log(message);
        fileLogger.log(message);
    }
}
