package lesson18;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task5Students {

    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task5Students");

        if (!directory.exists()) {
            directory.mkdir();
        }

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork" +
                File.separator + "Homework" + File.separator + "lesson18" + File.separator + "students.txt");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task5Students" + File.separator + "students_new.txt");


        try {
            List<String> listStudents = new ArrayList<>();
            double averageScore = 0.0;
            Scanner scanner = new Scanner(inputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String students[] = line.split(":");
                String surname = students[0];
                String scores[] = students[1].split(",");

                for (String score : scores) {
                    averageScore += Double.parseDouble(score);
                }

                averageScore = averageScore / scores.length;

                if (averageScore > 7) {
                    listStudents.add(Arrays.toString(new String[]{surname.toUpperCase(), Double.toString(averageScore)}));
                    continue;
                } else {
                    listStudents.add(Arrays.toString(new String[]{surname, Double.toString(averageScore)}));
                }


            }

            for (String str : listStudents) {
                bufferedWriter.write(str + "\n");
            }

            scanner.close();
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
