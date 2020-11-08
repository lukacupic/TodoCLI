package io.github.lukacupic.todocli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * The main program.
 */
public class TodoCLI {

    /**
     * The main method.
     *
     * @param args command line arguments; not used
     */
    public static void main(String[] args) {
        try {
            Files.walkFileTree(Paths.get("."), new TodoVisitor());
        } catch (IOException e) {
            System.err.println("Could not walk file tree!");
        }
    }
}
