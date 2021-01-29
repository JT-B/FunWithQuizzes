package FunWithQuizzesPackage;

import java.util.Scanner;

public class MultipleChoice extends Question {

    private String wrongAnswerOne;
    private String wrongAnswerTwo;
    Scanner input = new Scanner(System.in);

    public MultipleChoice(int questionNumber, String questionText, String correctAnswer, String wrongAnswerOne, String wrongAnswerTwo) {
        super(questionNumber, questionText, correctAnswer);
        this.wrongAnswerOne = wrongAnswerOne;
        this.wrongAnswerTwo = wrongAnswerTwo;

    }
    //How would we use Random here?
    public void displayOptions() {
        System.out.println(wrongAnswerOne);
        System.out.println(correctAnswer);
        System.out.println(wrongAnswerTwo);
    }

    @Override
    public void responseToQuestion() {
        System.out.println("What is the correct answer?");
        String userAnswer = input.nextLine();
        if (userAnswer.equals(this.correctAnswer)) {
            System.out.println("That is correct.");
        } else {
            System.out.println("That is not correct.");
        }
    }
}
