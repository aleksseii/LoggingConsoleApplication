package ru.aleksseii.logger;

import org.jetbrains.annotations.NotNull;

public abstract class Logger {

    protected static long linesCounter = 0L;

    public abstract void log(@NotNull String message);
}
