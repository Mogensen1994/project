public class QuizElement {
    private String question;
    private String correctAnswer;
    private String[] wrongAnswers;

    public QuizElement(String question, String correctAnswer, String[] wrongAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
    }

    public boolean isCorrect(String userAnswer) {
        System.out.println("Brugerens svar: " + userAnswer);
        System.out.println("Korrekt svar: " + correctAnswer);

        boolean result = userAnswer.equalsIgnoreCase(correctAnswer);

        System.out.println("Resultat: " + result);

        return result;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String[] getWrongAnswers() {
        return wrongAnswers;
    }
}
