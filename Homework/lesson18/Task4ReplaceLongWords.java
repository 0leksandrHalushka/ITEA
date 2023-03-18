package lesson18;

import java.io.*;

public class Task4ReplaceLongWords {

    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task4ReplaceLongWordsResult");

        if (!directory.exists()) {
            directory.mkdir();
        }

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork" +
                File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task4ReplaceLongWords.java");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task4ReplaceLongWordsResult" + File.separator + "Task4ReplacedWords.txt");


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            FileWriter fileWriter = new FileWriter(outputFile);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split("\\s+");
                String strInUpperCase;

                for (String word : str) {
                    if (word.length() > 2) {
                        strInUpperCase = word.toUpperCase();
                        line = line.replace(word, strInUpperCase);
                    }

                }
                fileWriter.write(line + "\n");
            }

            fileWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        }


    }
}
