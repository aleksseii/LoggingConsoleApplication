package ru.aleksseii;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;
import ru.aleksseii.application.Application;

public final class Main {

    public static void main(@NotNull String @NotNull [] args) {

        final Injector injector = Guice.createInjector(new LoggingApplicationModule());
        Application application = injector.getInstance(Application.class);
        application.waitForInput();
    }
}