package ru.aleksseii;

import com.google.inject.AbstractModule;
import ru.aleksseii.logger.*;

public final class LoggingApplicationModule extends AbstractModule {

    @Override
    protected void configure() {

//        binder().requireExplicitBindings();

        bind(Logger.class).annotatedWith(IntoConsole.class).to(ConsoleLogger.class);

        bind(Logger.class).annotatedWith(IntoFile.class).to(FileLogger.class);

        bind(ConsoleLogger.class).toInstance(new ConsoleLogger());

        bind(FileLogger.class).toInstance(new FileLogger());

    }
}
