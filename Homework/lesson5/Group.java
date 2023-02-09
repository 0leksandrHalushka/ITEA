package lesson5;


import java.util.Arrays;
import java.util.Scanner;

/*
Створіть клас, що описує людину (створіть метод, що виводить інформацію про людину).
На його основі створіть клас студент з полями (айді, ім'я, прізвище, факультет, рейтинг (середній бал), рік вступу) (перевизначте метод виведення інформації).
Створіть клас “група” який містить масив із 10 об'єктів класу студент.
Реалізуйте методи додавання/видалення студента та метод пошуку студента за прізвищем.
Визначте метод toString() для класу студент щоб він виводив ім'я та прізвище та середній бал у форматі ( Студент Петренко Олексій, рейтинг - 4,4 )

Додатково можна зробити (Визначте метод toString() для групи так, щоб він виводив список студентів в алфавітному порядку.)
*/

public class Group {

    Student stGroup [] = new Student[10];
    static int counter = 0;


    public void addStudent (){

        if (counter < stGroup.length){
        stGroup [counter] = new Student(addId(), addName(), addSurname() , addDepartment(), addRating(), addYear());
        counter++;
        } else {
            System.out.println("Array is full");
        }

    }

    public void  search(){
        System.out.println("Enter student surname for search:");
        Scanner in = new Scanner(System.in);
        String surName = in.next();

        for (Student stud: stGroup) {
            if (stud.surname.equals(surName) && stud != null) {
                System.out.println(stud);
            }
        }
    }

    public void delStudent(){
        System.out.println("Enter student ID for deleting:");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        int count = 0;

        for (Student stud: stGroup) {
            if (stud.idStudent == id){
                stGroup[count] = null;
            }
            count++;

        }

        System.out.println("Student with ID " + id + " has been deleted");

    }

    public int addId (){
        System.out.println("Enter student ID:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()){
            return in.nextInt();
        }
       return addId();
    }

    public String addName(){
        System.out.println("Enter student name:");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public String addSurname(){
        System.out.println("Enter student surname:");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public String addDepartment(){
        System.out.println("Enter student department:");
        Scanner in = new Scanner(System.in);
        return in.next();
    }


    public double addRating (){
        System.out.println("Enter student rating:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextDouble()){
            return in.nextDouble();
        }
        return addRating();
    }

    public int addYear (){
        System.out.println("Enter student year entry:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()){
            return in.nextInt();
        }
        return addYear();
    }


    public void outStudentArray (){
        System.out.println(Arrays.toString(stGroup));
    }

    public static void main(String[] args) {

        Group group = new Group();

        Scanner scanner = new Scanner(System.in);
        String act = "";

        while (!act.equals("ext")) {
            System.out.println("Select action \"add\" \"del\" \"search\" \"ext\"");
            act = scanner.next();
            switch (act) {
                case "add":
                    group.addStudent();
                    break;

                case "del":
                    group.delStudent();
                    act = "ext";
                    break;
                case "search":
                    group.search();
                    break;
                case "ext": act = "ext";
                break;

                default:
                    System.out.println("Incorrect command");
                    break;
            }

        }
        System.out.println("Exit");
        group.outStudentArray();

    }


}










