package lesson18;

import java.io.*;

public class Task3Reversed {

    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task3ReversedResult");

        if (!directory.exists()) {
            directory.mkdir();
        }

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork" +
                File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task3Reversed.java");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task3ReversedResult" + File.separator + "Task3Reversed.txt");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            FileWriter fileWriter = new FileWriter(outputFile);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String reverseLine = new StringBuilder(line).reverse().toString();
                fileWriter.write(reverseLine + "\n");
            }

            bufferedReader.close();
            fileWriter.close();

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        }

    }

}
