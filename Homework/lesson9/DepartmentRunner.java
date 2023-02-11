package lesson9;

public class DepartmentRunner {
    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentName("Develop");
        department.positions("Ivanov Ivan", "Engineer");
        System.out.println(department);
    }
}
