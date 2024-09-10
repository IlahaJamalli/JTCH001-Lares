package SecondMonth;
import java.util.Scanner;

public class QuizGame {
    String question;
    String[] options;
    char correctAnswer;
    int point;

    public QuizGame(String question, String[] options, char correctAnswer, int point) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.point = point;
    }
    public void displayQuestion(){
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char)('A' + i) +"."+ options[i]);
        }
    }
    boolean isCorrect(char answer){
        return answer==correctAnswer;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Welcome to Quiz Game!");
        QuizGame question1=new QuizGame("What is the chemical symbol for gold?", new String[]{"Au", "Ag", "Pt", "Fe"}, 'A', 1 );
        QuizGame question2=new QuizGame("Which country hosted the 2016 Summer Olympics?", new String[]{"China", "US", "Russia", "Brazil"}, 'D', 2 );
        QuizGame question3=new QuizGame("What is the smallest prime number?", new String[]{"0", "1", "2", "3"}, 'C', 4 );
        QuizGame question4=new QuizGame("What is the primary greenhouse gas emitted through human activities?", new String[]{"Methane", "Carbon dioxide", "Nitrous oxide", "Chlorofluorocarbons (CFCs)"}, 'B', 3 );

        QuizGame[] quizGame={question1, question2, question3, question4};
        int score=0;
        for (int i = 0; i <quizGame.length; i++) {
            QuizGame question=quizGame[i];
            question.displayQuestion();
            System.out.println("Enter your option, skip a question if you're unsure(S)");
            char answer=scan.next().toUpperCase().charAt(0);
            if(answer=='S'){
                continue;
            } else if (question.isCorrect(answer)) {
                score+=question.point;
                System.out.println("Correct answer");
            } else{
                System.out.println("Wrong answer");
            }
 }
        if(score==10){
            System.out.println("Congratulations, you got full score");
        } else {
            System.out.println("Your score is: "+ score);
        }
    }
}
