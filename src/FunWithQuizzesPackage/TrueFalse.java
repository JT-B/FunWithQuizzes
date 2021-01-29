package FunWithQuizzesPackage;


import java.util.Scanner;

public class TrueFalse extends Question {

 Scanner input = new Scanner(System.in);

    public TrueFalse(int questionNumber, String questionText, String correctAnswer) {
        super(questionNumber, questionText, correctAnswer);

    }

    @Override
    public void responseToQuestion() {
        System.out.println("Is this true or false?");
        String userAnswer = input.nextLine();
        if (userAnswer.equals(this.correctAnswer)) {
            System.out.println("That is correct.");
        } else {
            System.out.println("That is not correct.");
        }
    }
}
