package ru.aleksseii;

import com.google.inject.AbstractModule;

import org.jetbrains.annotations.NotNull;
import ru.aleksseii.logger.CompositeLogger;
import ru.aleksseii.logger.ConsoleLogger;
import ru.aleksseii.logger.FileLogger;
import ru.aleksseii.logger.Logger;

import java.util.Locale;

public final class LoggingApplicationModule extends AbstractModule {

    private final @NotNull String @NotNull [] cmdArguments;

    public LoggingApplicationModule(@NotNull String @NotNull [] cmdArguments) {
        super();
        this.cmdArguments = cmdArguments;
    }

    @Override
    protected void configure() {

        switch (cmdArguments[0].toLowerCase(Locale.ROOT)) {

            case "console" -> bind(Logger.class).toInstance(new ConsoleLogger());
            case "file" -> {
                if (cmdArguments.length < 2) {
                    throw new IllegalArgumentException("missing tag");
                }
                bind(Logger.class).toInstance(new FileLogger(cmdArguments[1]));
            }
            case "composite" -> {
                if (cmdArguments.length < 2) {
                    throw new IllegalArgumentException("missing tag");
                }
                bind(Logger.class).toInstance(new CompositeLogger(
                                new ConsoleLogger(),
                                new FileLogger(cmdArguments[1])
                        ));
            }
            default -> throw new IllegalArgumentException("There is no such a logging option");
        }
    }
}
