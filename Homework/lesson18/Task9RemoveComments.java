package lesson18;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


/*

З тексту Java-програми видалити всі види коментарів.

 */


/**
 * Dock comments example
 */


// тут звичайний коментар

public class Task9RemoveComments {

    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task9RemoveCommentsResult");

        if (!directory.exists()) {
            directory.mkdir();
        }

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork" +
                File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task9RemoveComments.java");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task9RemoveCommentsResult" + File.separator + "Task9RemoveCommentsResult.txt");   // в txt форматі, щоб не заважало


        try {

            var lines = Files.readAllLines(Path.of(inputFile.getPath()));

            String newLine;
            var result = new ArrayList<String>();
            boolean blockComment = false;


            for (String line : lines) {
                if (line.contains("//")) {
                    var index = line.indexOf("//");
                    if (index == 0) {
                        // do nothing.
                    } else {
                        final var newline = line.substring(0, index);
                        result.add(newline);
                    }
                } else {
                    if (line.contains("/*")) {
                        blockComment = true;
                        var firstIndex = line.indexOf("/*");
                        if (line.contains("*/")) {
                            var lastIndex = line.indexOf("*/");
                            var newline = line.substring(0, firstIndex) + line.substring(lastIndex + 2);
                            result.add(newline);
                            blockComment = false;
                        }
                    } else if (!line.contains("*/") && blockComment) {
                        //do nothing.
                    } else if (line.contains("*/") && blockComment) {
                        var lastIndex = line.indexOf("*/");
                        var newline = line.substring(lastIndex + 2);
                        result.add(newline);
                        blockComment = false;
                    } else {
                        result.add(line);
                    }
                }
            }

            newLine = String.join("\n", result);
            Files.writeString(Path.of(outputFile.getPath()), newLine);

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        }
    }
}