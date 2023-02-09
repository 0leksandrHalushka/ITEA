package lesson8;

public class UserInfoMain {

    public static void main(String[] args) {

        UserInfo user1 = new UserInfo("Egor", "qwerty123!");
        UserInfo user2 = new UserInfo("Igor", "qwerty123!");
        UserInfo user3 = new UserInfo("Egor", "qwerty123");
        UserInfo user4 = new UserInfo("Egor", "qwerty");

        System.out.println(user1.equalsInfo(user2));
        System.out.println(user1.equalsInfo(user3));
        System.out.println(user1.equalsInfo(user4));
        System.out.println(user3.equalsInfo(user4));

    }
}
