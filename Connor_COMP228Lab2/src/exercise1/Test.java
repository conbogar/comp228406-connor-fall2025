package exercise1;

import javax.swing.*;
import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;

public class Test {
    private static final String[] options = {"A)", "B)", "C)", "D)"};
    private int questionNumber;
    private int correctChoice;
    private int correctCount = 0, incorrectCount = 0;
    private boolean stop = false;
    private static final Random RNG = new Random();

    private void question1() {
        questionNumber = 1;
        correctChoice = 3;
        String question = question("What prints a line to the console?",
                "System.print(\"Hello\");",
                "System.out.printf(\"Hello\");",
                "Console.WriteLine(\"Hello\");",
                "System.out.println(\"Hello\");"
        );
        int choice = getChoice(questionNumber, question);
        Answer result = postResult(choice, correctChoice);
        checkResult(result);
    }

    private void question2() {
        questionNumber = 2;
        correctChoice = 0;
        String question = question("How do you get an arrays length?",
                "arr.length",
                "arr.length()",
                "arr.size()",
                "length(arr)");
        int choice = getChoice(questionNumber, question);
        Answer result = postResult(choice, correctChoice);
        checkResult(result);
    }

    private void question3() {
        questionNumber = 3;
        correctChoice = 1;
        String question = question("Which loop runs 10 times from 0 to 9?",
                "for (int i = 1; i <= 10; i++)",
                "for (int i = 0; i < 10; i++)",
                "for (int i = 0; i <= 9; i--)",
                "for (let i = 0; i < 10; i++)");
        int choice = getChoice(questionNumber, question);
        Answer result = postResult(choice, correctChoice);
        checkResult(result);
    }

    private void question4() {
        questionNumber = 4;
        correctChoice = 2;
        String question = question("Which declaration is the correct entry point for a standard Java application?",
                "public void main(String[] args)",
                "public static int main(String[] args)",
                "public static void main(String[] args)",
                "public static void main()");
        int choice = getChoice(questionNumber, question);
        Answer result = postResult(choice, correctChoice);
        checkResult(result);
    }

    private void question5() {
        questionNumber = 5;
        correctChoice = 3;
        String question = question("Which of the following statements is false about Java method statements?",
                "Statements in a method body use existing classes and methods as building blocks to create new programs.",
                "Statements in a method body is written only once.",
                "Statements in a method body determine the behavior of an object.",
                "Statements in a method body are not hidden from other methods.");
        int choice = getChoice(questionNumber, question);
        Answer result = postResult(choice, correctChoice);
        checkResult(result);
    }

    private enum Answer {
        CORRECT,
        INCORRECT,
        CLOSED
    }

    static private Answer postResult(int choice, int correctChoice) {
        if (choice == JOptionPane.CLOSED_OPTION) return Answer.CLOSED;
        else if (choice == correctChoice) return Answer.CORRECT;
        else return Answer.INCORRECT;
    }

    private void checkResult(Answer result) {
        if (result == Answer.CLOSED) {
            stop = true;
            return;
        }
        tally(result);
        String msg = generateMessage(result);
        if (result == Answer.INCORRECT) {
            msg += "\nCorrect answer: " + options[correctChoice];
        }
        showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    static private int getChoice(int questionNumber, String question) {
        int randomOption = RNG.nextInt(options.length);
        return JOptionPane.showOptionDialog(
                null,
                question,
                "Question " + questionNumber,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                Test.options,
                Test.options[randomOption]
        );
    }

    private String generateMessage(Answer a) {
        int r = RNG.nextInt(4);
        return switch (r) {
            case 0 -> a == Answer.CORRECT ? "Excellent!" : "No. Please try again.";
            case 1 -> a == Answer.CORRECT ? "Good!" : "Wrong. Try once more.";
            case 2 -> a == Answer.CORRECT ? "Keep up the good work!" : "Don't give up!";
            default -> a == Answer.CORRECT ? "Nice work!" : "No. Keep trying.";
        };
    }

    private String question(String question, String questionOption1, String questionOption2, String questionOption3, String questionOption4) {
        return String.format(
                "<html>%s<br>A) %s<br>B) %s<br>C) %s<br>D) %s</html>",
                question, questionOption1, questionOption2, questionOption3, questionOption4
        );
    }

    private void tally(Answer a) {
        if (a == Answer.CORRECT) correctCount++;
        else if (a == Answer.INCORRECT) incorrectCount++;
    }

    private void showSummary() {
        int total = correctCount + incorrectCount;
        int pct = (total == 0) ? 0 : (int)Math.round(100.0 * correctCount / total);
        showMessageDialog(null,
                "Correct: " + correctCount +
                        "\nIncorrect: " + incorrectCount +
                        "\nScore: " + pct + "%");
    }

    public void inputAnswer() {
        question1(); if (stop) {showSummary(); return;}
        question2(); if (stop) {showSummary(); return;}
        question3(); if (stop) {showSummary(); return;}
        question4(); if (stop) {showSummary(); return;}
        question5();
        showSummary();
    }
}
