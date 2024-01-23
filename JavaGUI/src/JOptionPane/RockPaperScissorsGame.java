package JOptionPane;

import javax.swing.*;
import java.util.Random;

public class RockPaperScissorsGame {
    private static final String choice1 = "Paper";
    private static final String choice2 = "Scissors";
    private static final String choice3 = "Rock";
    private static Random random = new Random(3);  // Compliant

    public static int doSomethingCommon() {
        return (random.nextInt(3));
    }

    public static String userName() {
        return (JOptionPane.showInputDialog("Enter Your Name:"));
    }
    public static String userChoice() {
        String[] choice = {choice1, choice2, choice3};
        return ((String) JOptionPane.showInputDialog(null, "Rock, Paper Or Scissors", "Let's Play", JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]));
    }


    public static String computerChoice() {
        String[] choice = {choice1, choice2, choice3};
        int randomIndex = doSomethingCommon();
        return(choice[randomIndex]);
    }

    public String decideWinner(String userChoice, String computerChoice, String userName) {
        if(userChoice.equals(computerChoice)) {
           return("The game is tie");
        }
        else if(
                userChoice.equals(choice3) && computerChoice.equals(choice1)||
                        userChoice.equals(choice1) && computerChoice.equals(choice2) ||
                        userChoice.equals(choice2) && computerChoice.equals(choice3)
        ) {
            return (userName + " choice is " + userChoice + "\nComputer choice is "+ computerChoice +"\nOops!! Computer Wins");
        }
        else {
            return (userName + " choice is " + userChoice + "\nComputer choice is "+ computerChoice +"\nHurray!! " +userName+ " wins");
        }
    }

    public static void main(String[] args) {
        int replay;
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String userName = game.userName();
        do {
            String userChoice = game.userChoice();
            String computerChoice = game.computerChoice();
            String result = game.decideWinner(userChoice, computerChoice, userName);
            JOptionPane.showMessageDialog(null, result);
            replay = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again?", JOptionPane.YES_NO_OPTION);
        } while (replay == 0);
    }

}
