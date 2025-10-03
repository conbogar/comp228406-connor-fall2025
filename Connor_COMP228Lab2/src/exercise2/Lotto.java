package exercise2;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;

public class Lotto {
    private final int[] numbers = new int[3];
    private static final Random RNG = new Random();

    public Lotto() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RNG.nextInt(9) + 1;
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public int getSum() {
        return numbers[0] + numbers[1] + numbers[2];
    }

    private Integer getUserChoice() {
        while(true) {
            String s = JOptionPane.showInputDialog(
                    null,
                    "Enter a number between 3 and 27",
                    "Pick your lotto number",
                    JOptionPane.QUESTION_MESSAGE
            );
            if (s == null) return null;
            try {
                int n = parseInt(s.trim());
                if (n >= 3 && n <= 27) return n;
            }
            catch (NumberFormatException ignore) {}
            showMessageDialog(null,
                    "Please enter a number from 3 to 27.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void runGame() {
        boolean userWon = false;
        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int comp = lotto.getSum();
            Integer user = getUserChoice();
            if (user == null) return;
            if (user == comp) {
                showMessageDialog(null,
                        "You win!",
                        "Winner!",
                        JOptionPane.PLAIN_MESSAGE
                );
                userWon = true;
                break;
            }
            else if (i < 4){
                showMessageDialog(null,
                        "Not this time.\nLotto Number: " + comp +
                                "\nYour number: " + user,
                        "Try again.",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        }
        if (!userWon) {
            showMessageDialog(null,
                    "Game over. Computer wins.",
                    "Game over",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
    }
}
