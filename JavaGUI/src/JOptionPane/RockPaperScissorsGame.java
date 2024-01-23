package JOptionPane;

import javax.swing.*;

public class RockPaperScissorsGame {

    public static String userName() {
        return ((String) JOptionPane.showInputDialog("Enter Your Name:"));
    }
    public static String userChoice() {
        String[] choice = {"Paper", "Scissors", "Rock"};
        return ((String) JOptionPane.showInputDialog(null, "Rock, Paper Or Scissors", "Let's Play", JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]));
    }


    public static String computerChoice() {
        String[] choice = {"Paper", "Scissors", "Rock"};
        int randomIndex = (int)(Math.random()*3);
        return(choice[randomIndex]);
    }

    public String decideWinner(String userChoice, String computerChoice, String userName) {
        if(userChoice.equals(computerChoice)) {
           return("The game is tie");
        }
        else if(
                userChoice.equals("Rock") && computerChoice.equals("Paper")||
                        userChoice.equals("Paper") && computerChoice.equals("Scissors") ||
                        userChoice.equals("Scissors") && computerChoice.equals("Rock")
        ) {
            return (userName + " choice is " + userChoice + "\nComputer choice is "+ computerChoice +"\nOops!! Computer Wins");
        }
        else {
            return (userName + " choice is " + userChoice + "\nComputer choice is "+ computerChoice +"\nHurray!! " +userName+ " wins");
        }
    }

    public static void main(String[] args) {
        int replay;
        String userName = userName();
        do {
            RockPaperScissorsGame ob = new RockPaperScissorsGame();
            String userChoice = userChoice();
            String computerChoice = computerChoice();
            String result = ob.decideWinner(userChoice, computerChoice, userName);
            JOptionPane.showMessageDialog(null, result);
            replay = (int) JOptionPane.showOptionDialog(null, "Do you want to play again?", "Play Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, null, JOptionPane.YES_OPTION);
        }while(replay == 0);
    }
}
