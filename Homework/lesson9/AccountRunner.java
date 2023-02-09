package lesson9;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountName("User 1");
        account.setAccount(10, 15, 110);
        System.out.println(account);

    }

}
