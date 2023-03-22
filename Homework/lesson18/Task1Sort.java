package lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1Sort {
    public static void main(String[] args) {

        File directory = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task1Sorted");

        if (!directory.exists()) {
            directory.mkdir();
        }

        List<Integer> nums = new ArrayList<>();

        var file = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task1Sorted" + File.separator + "result.txt");


        PrintWriter printWriter = null;


        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                nums.add(random.nextInt(100));
            }

            Collections.sort(nums);

            printWriter = new PrintWriter(bufferedWriter);
            for (var value : nums) {
                printWriter.print(value + " ");
            }

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }

        }
    }
}
