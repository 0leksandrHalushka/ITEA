package lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6NumbersAndChars {

    public static void main(String[] args) {

        var inputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task6NumbersAndChars" + File.separator + "file.txt");

        var outputFile = new File("D:" + File.separator + "Java_projects" + File.separator + "ITEA" + File.separator + "HomeWork"
                + File.separator + "Homework" + File.separator + "lesson18" + File.separator + "Task6NumbersAndChars" + File.separator + "outfile.txt");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            Writer writer = new FileWriter(outputFile);
            String line;
            List<Integer> listInt = new ArrayList<>();
            List<Double> listDouble = new ArrayList<>();
            List<String> listString = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {
                Pattern patternString = Pattern.compile("[a-zA-Z]+");  //
                Matcher matcherString = patternString.matcher(line);
                while (matcherString.find()) {
                    listString.add(matcherString.group());
                }

                Pattern patternDouble = Pattern.compile("\\b\\d+\\.\\d+\\b"); //
                Matcher matcherDouble = patternDouble.matcher(line);
                while (matcherDouble.find()) {
                    listDouble.add(Double.parseDouble(matcherDouble.group()));
                }

                Pattern patternInt = Pattern.compile("(?<![0-9]\\.)(?<![0-9])[0-9]+(?!\\.?[0-9])|\\b\\p{L}\\b"); //
                Matcher matcherInt = patternInt.matcher(line);
                while (matcherInt.find()) {
                    listInt.add(Integer.parseInt(matcherInt.group()));
                }

            }

            writer.write("Strings: " + listString + "\n");
            writer.write("Integers: " + listInt + "\n");
            writer.write("Doubles: " + listDouble + "\n");

            writer.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу або створення файлу" + e);
        }

    }

}
