package JavaGUI;
import javax.swing.JOptionPane;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        while (true) {
            // Get user choice
            String userChoice = getUserChoice();

            // Generate computer choice
            String computerChoice = generateComputerChoice();

            // Determine the winner
            String result = determineWinner(userChoice, computerChoice);

            // Display the result
            displayResult(userChoice, computerChoice, result);

            // Ask if the user wants to play again
            int playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
            if (playAgain != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    public static String getUserChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return (String) JOptionPane.showInputDialog(null, "Choose Rock, Paper or Scissors:", "Rock Paper Scissors Hello", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
    }

    public static String generateComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int randomIndex = (int) (Math.random() * choices.length);
        return choices[randomIndex];
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors"))
                || (userChoice.equals("Paper") && computerChoice.equals("Rock"))
                || (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void displayResult(String userChoice, String computerChoice, String result) {
        JOptionPane.showMessageDialog(null, "Your choice: " + userChoice + "\nComputer's choice: " + computerChoice + "\nResult: " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
