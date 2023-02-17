package lesson11;

public class UserCheck {

    public static boolean checkUser (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        boolean onlyLatinAlphabetLogin = login.matches("^[a-zA-Z0-9_]+$");
        boolean onlyLatinAlphabetPassword = password.matches("^[a-zA-Z0-9_]+$");

        if (!onlyLatinAlphabetLogin || login.length() >= 20 ) {
            throw new WrongLoginException("Incorrect login");
        } else if (!onlyLatinAlphabetPassword || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        } else {
            return true;
        }

    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean resultCheck = false;

        try {
            resultCheck = checkUser("1234567890qwerty_1", "1234567890qwertyui1", "1234567890qwertyui1");
            System.out.println(resultCheck);
        } catch (WrongPasswordException | WrongLoginException exception) {
            System.out.println(resultCheck);
            System.err.println(exception);
        }

    }

}
