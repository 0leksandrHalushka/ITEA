package lesson5;

public class Student extends Human {
    int idStudent;
    double rating;
    int entryYear;
    String department;

    public Student(int idStudent, String name, String surname, String department, double rating, int entryYear) {
        super(name, surname);
        this.idStudent = idStudent;
        this.department = department;
        this.rating = rating;
        this.entryYear = entryYear;

    }


    @Override
    public void humanInfo() {
        System.out.println("Student id: " + idStudent + "\n" + "Student name: " + name + "\n" + "Student department: " + department + "\n" + "Student rating: " + rating + "\n" + "Student entry year: " + entryYear + "\n");
    }


    @Override
    public String toString(){
        return "Student: " + surname + " " + name + ", " + "Rating - " + rating;
    }


}




