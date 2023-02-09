package lesson9;


import java.util.Date;
import java.util.Scanner;

public class Notepad {
  private Date date = new Date();
   private String name;
   private String description;
   private int num;
   private int numbersOfRecord;
   private Record record;

    private class Record {
    private String [] record() {    // an array with the entered number of records is created
         enterNum();
         String note [] = new String[num];
         for (int i = 0; i < num; i++) {
             numbersOfRecord++;
             name = enterName();
             description = enterDescr();
             note[i] = toString();
         }
         return note;
     }

     private int enterNum (){   // enter number of records
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter numbers of record in note:");
         num = scanner.nextInt();
         return num;
     }

     private String enterName() { // enter name of record
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a title for the note");
         name = scanner.nextLine();
         return name;
     }

     private String enterDescr() {  // enter description of record
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the text of the note");
         description = scanner.nextLine();
         return description;
     }

     @Override
     public String toString(){
         return "Record number: " + numbersOfRecord + " | Date of record: " + date + " | Name: " + name + " | Description: " + description + "\n";
     }

    }
    public void print(){   // public method for print array
    record = new Record();
        for (String element: record.record()) {
            System.out.println(element);
        }
 }

}
