package lesson14;

import java.util.ArrayList;

public class StudentsRunner {

    public static void main(String[] args) {

        ArrayList<Students> studentsArrayList = new ArrayList<>();
        Students students = new Students();

        studentsArrayList.add(new Students("Mark", "EMB 12", 3, 3, 5, 4, 5));
        studentsArrayList.add(new Students("Alex", "EMB 11", 4, 4, 4, 4, 3));
        studentsArrayList.add(new Students("Bob", "EMB 12", 3, 2, 2, 2, 2)); // deleting AVG score 2
        studentsArrayList.add(new Students("Alice", "EMB 10", 5, 1, 5, 4, 3));
        studentsArrayList.add(new Students("George", "EMB 12", 3, 3, 3, 4, 2));  // deleting AVG score 2.5
        studentsArrayList.add(new Students("Ivan", "EMB 11", 4, 2, 3, 2, 3));
        studentsArrayList.add(new Students("Dmitry", "EMB 10", 5, 5, 5, 4, 5));


        //Print to the console students who have been transferred to the next course
        System.out.println("Transferred to the next year of university:");
        for (Students stud:students.transferStudent(studentsArrayList)) {
            System.out.print(stud +"\n");
        }

        System.out.println();

        //print to the console of 5th course students
        new Students().printStudents(studentsArrayList, 5);

    }



}

