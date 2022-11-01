package ru.aleksseii.application;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import ru.aleksseii.logger.Logger;

import java.util.NoSuchElementException;
import java.util.Scanner;

public final class Application {

    private final Logger logger;

    @Inject
    public Application(@NotNull Logger logger) {
        this.logger = logger;
    }

    public void waitForInput() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");

            //noinspection InfiniteLoopStatement
            while (true) {

                String line = scanner.nextLine();
                logger.log(line);
            }

        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("Logging successfully finished!");
        }
    }
}
