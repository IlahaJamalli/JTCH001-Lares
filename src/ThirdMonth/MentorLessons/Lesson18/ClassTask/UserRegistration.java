package ThirdMonth.MentorLessons.Lesson18.ClassTask;

public class UserRegistration {

    public static void registerUser(String name, String password) throws UserRegistrationException {

        if(name.length()< 8 || password.length()<8){
            throw new UserRegistrationException("Invalid name or password ");
        }
    }
}
