package FunWithQuizzesPackage;

public class QuizRunner {
    public static void main(String[] args) {

        TrueFalse questionOne = new TrueFalse(1, "Is St. Louis in Missouri?", "true");
        questionOne.questionPrompt();
        questionOne.responseToQuestion();


        MultipleChoice questionTwo = new MultipleChoice(2, "How many wheels does a car have?", "four", "three", "twenty");
        questionTwo.questionPrompt();
        questionTwo.displayOptions();
        questionTwo.responseToQuestion();
    }
}