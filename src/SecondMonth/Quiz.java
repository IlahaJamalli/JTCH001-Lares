package SecondMonth;

public class Quiz {
    String question;
    char answer;
    boolean trueFalse;

    public Quiz(String question, char answer, boolean trueFalse) {
        this.question=question;
        this.answer=answer;
        this.trueFalse=trueFalse;
    }

    public void startQuiz(){
        System.out.println("Welcome to our Quiz! ");
    }
    public boolean askQuestion(){

        return true;
    }

}
