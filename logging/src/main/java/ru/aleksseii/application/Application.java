package ru.aleksseii.application;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import ru.aleksseii.logger.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public final class Application {

    @IntoConsole
    private final @NotNull Logger consoleLogger;

    @IntoFile
    private final @NotNull Logger fileLogger;

    @Inject
    public Application(@IntoConsole @NotNull Logger consoleLogger,
                       @IntoFile @NotNull Logger fileLogger) {

        this.consoleLogger = consoleLogger;
        this.fileLogger = fileLogger;
    }

    public void waitForInput() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");

            long lineCounter = 0;

            //noinspection InfiniteLoopStatement
            while (true) {

                String line = scanner.nextLine();

            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("Logging successfully finished!");
        }
    }
}
