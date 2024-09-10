package ThirdMonth.MentorLessons.Lesson17.Task3;

public class LoginSystem {
    public static void login(String name, String password) throws AuthenticationException {
        String givenName="Ilahe";
        String givenPassword="16111";

        if(!name.equals(givenName) || !password.equals(givenPassword) ){
            throw new AuthenticationException("Invalid username or password.");
        }
    }
}
