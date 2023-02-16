package lesson11;

public class UserCheck {
    public static void checkUser (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        boolean onlyLatinAlphabetLogin = login.matches("^[a-zA-Z0-9_]+$");
        boolean onlyLatinAlphabetPassword = password.matches("^[a-zA-Z0-9_]+$");

        if (onlyLatinAlphabetLogin && login.length() < 20 ) {
            System.out.println("Login is ok!");
        } else {
            throw new WrongLoginException("Incorrect login");
        }

        if (onlyLatinAlphabetPassword && password.length() <20 && password.equals(confirmPassword)) {
            System.out.println("Password is ok!");
        } else {
            throw new WrongPasswordException("Incorrect password");
        }

    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        try {
            checkUser("1234567890qwertyuio", "1234567890qwertyuio", "1234567890qwertyuio1");
        } catch (WrongPasswordException exception) {
            System.err.println(exception);
        } catch (WrongLoginException exception){
            System.err.println(exception);
        }

    }

}
