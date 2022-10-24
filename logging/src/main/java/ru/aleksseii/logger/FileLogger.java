package ru.aleksseii.logger;

import org.apache.logging.log4j.LogManager;


public final class FileLogger implements Logger {

    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(this);

    @Override
    public void log(long lineNumber, String message) {

    }
}
