package FirstMonth;

import java.util.Scanner;

    public class QuizGame {
     int score;
     Scanner scan;

    public QuizGame() {
        score = 0;
        scan = new Scanner(System.in);
    }

    public void startQuiz() {
        System.out.println("Welcome to Quiz!");
    }

    public void askQuestion(String question, String[] options, char correctAnswer) {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }

        char answer = scan.next().toUpperCase().charAt(0);
        evaluateAnswer(answer, correctAnswer);
    }
//takes
    public void evaluateAnswer(char answer, char correctAnswer) {
        if (answer == correctAnswer) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer was " + correctAnswer + ".");
        }
    }

    public void endQuiz() {
        System.out.println("Quiz over! Your final score is: " + score);
    }

    public static void main(String[] args) {
        QuizGame quizGame = new QuizGame();
        quizGame.startQuiz();

        String question1 = "What is the chemical symbol for water?";
        String[] options1 = {"H2O", "CO2", "O2"};
        quizGame.askQuestion(question1, options1, 'A');

        String question2 = "How many planets are in our solar system?";
        String[] options2 = {"7", "8", "9"};
        quizGame.askQuestion(question2, options2, 'B');

        String question3 = "What is the capital of France?";
        String[] options3 = {"Berlin", "Madrid", "Paris"};
        quizGame.askQuestion(question3, options3, 'C');

        quizGame.endQuiz();
    }
}


