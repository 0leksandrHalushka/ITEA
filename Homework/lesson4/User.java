package lesson4;

/*
1- Створіть клас під назвою «User» зі текстовою змінною «name» і цілочисельною змінною «age».
Призначте значення age як «24», а для name — «Петро», створивши об’єкт класу User.
 */
public class User {
    static String name;
    static int age;

    User (String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
       User user = new User("Петро", 24);
       System.out.println("Ім'я " + user.name + ". Вік - " + user.age + " роки.");
    }

}
