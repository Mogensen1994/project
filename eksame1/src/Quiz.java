import java.util.Scanner;
import java.util.ArrayList;
//import scanner samt arraylist så vi kan oprette arraylist samt scanner for bruger input
public class Quiz {
    private ArrayList<QuizElement> quizElements = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addQuizElement(QuizElement quizElement) {
        quizElements.add(quizElement);
    }

    public void playGame() {
        for (QuizElement quizElement : quizElements) {
            askQuestion(quizElement);
        }
    }

    public void askQuestion(QuizElement quizElement) {
        System.out.println("Spørgsmål: " + quizElement.getQuestion());
        System.out.println("Svarmuligheder:");
        System.out.println("A. " + quizElement.getCorrectAnswer());
        for (int i = 0; i < quizElement.getWrongAnswers().length; i++) {
            System.out.println((char) ('B' + i) + ". " + quizElement.getWrongAnswers()[i]);
        }

        System.out.print("Indtast dit svar (A, B, C osv.): ");
        String userAnswer = scanner.nextLine();

        // her trimmer jeg svaret samt gør alt uppercase så programt kan læse det
        userAnswer = userAnswer.trim().toUpperCase();

        if (quizElement.isCorrect(userAnswer)) {
            System.out.println("Korrekt!\n");
            System.out.println("1 point for det korrekte svar.");
        } else {
            System.out.println("Forkert. Det korrekte svar er: " + quizElement.getCorrectAnswer() + "\n");
        }
    }
}
