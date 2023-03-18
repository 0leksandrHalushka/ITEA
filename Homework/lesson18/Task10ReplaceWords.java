package lesson18;

import java.io.*;

public class Task10ReplaceWords {

    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task10ReplaceWords");

        if (!directory.exists()) {
            directory.mkdir();
        }

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork" +
                File.separator + "Homework" + File.separator + "lesson18" + File.separator + "readme.txt");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task10ReplaceWords" + File.separator + "replace.txt");   // в txt форматі, щоб не заважало


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            FileWriter fileWriter = new FileWriter(outputFile);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                String firstWord = words[0];
                String lastWord = words[words.length - 1];

                words[0] = lastWord;
                words[words.length - 1] = firstWord;
                line = String.join(" ", words);

                fileWriter.write(line + "\n");
            }

            fileWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        }

    }
}