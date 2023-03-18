package lesson18;

import java.io.*;

public class Task8FormatCode {
    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task8FormatCode");

        if (!directory.exists()) {
            directory.mkdir();
        }

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork" +
                File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task8FormatCode.java");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task8FormatCode" + File.separator + "Task8FormatCode.txt");   // в txt форматі, щоб не заважало

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            FileWriter fileWriter = new FileWriter(outputFile);

            String tab = "  ";
            String newLine = "\n";
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll(tab, "");
                line = line.replaceAll(newLine, "");
                fileWriter.write(line + "\n");

            }

            bufferedReader.close();
            fileWriter.close();

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        }
    }
}