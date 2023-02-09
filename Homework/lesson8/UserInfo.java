package lesson8;

import lesson4.User;

import java.util.Objects;

/*
2. Напишіть клас для реалізації класу інформації користувача.

Завдання:
Поля: ім'я користувача, пароль
Методи: перевірка інформації про користувача (можна назвати login)


Вимога:

Розробіть конструктор для реалізації присвоєння властивостей
Встановіть private властивість до полів та методи get/set для доступу до них

Перевірка інформації про користувача визначає, чи збігається інформація про двох користувачів. Якщо ім'я користувача та пароль збігаються, поверніть: ім'я користувача та пароль збігаються, інакше поверніть: ім'я користувача або пароль не збігаються

результат роботи: створюємо екземпляр класу зі значеннями , викликаємо метод

 */
public class UserInfo {

    private String userName;
    private String userPass;

    public UserInfo(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }


    public String equalsInfo(Object o) {
        if (this == o) return "Ім'я користувача та пароль збігаються";
        if (o == null || getClass() != o.getClass()) return "Ім'я користувача та пароль не збігаються";
        UserInfo userInfo = (UserInfo) o;
        if (Objects.equals(userName, userInfo.userName) && Objects.equals(userPass, userInfo.userPass))  return "Ім'я користувача та пароль збігаються";
        return "Ім'я користувача та пароль не збігаються";
    }




}

