package lesson18;

import java.io.*;

public class Task2Replace {

    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task2ReplaceResult");

        if (!directory.exists()) {
            directory.mkdir();
        }

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork" +
                File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task2Replace.java");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task2ReplaceResult" + File.separator + "Task2Replaced");

        try {

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            String line;

            while ((line = reader.readLine()) != null) {
                String newLine = line.replace("public", "private");
                writer.write(newLine + "\n");
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        }

    }

}
