public class Login {

    public static boolean authenticate(String username, String password) {

        if ( password.equalsIgnoreCase("Witaj Przygodo")) {
            return true;
        }
        return false;
    }
}
