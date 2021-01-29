package FunWithQuizzesPackage;

public abstract class Question {
    private int questionNumber;
    private String questionText;
    protected String correctAnswer;

    public Question(int questionNumber, String questionText) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
    }

    public Question(int questionNumber, String questionText, String correctAnswer) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }
    public void questionPrompt() {
        System.out.println(this.questionNumber);
        System.out.println(this.questionText);
    }
    public abstract void responseToQuestion();


}
