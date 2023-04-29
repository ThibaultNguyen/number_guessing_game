package guessinggame;
* Java game "Guess a number" that allows user to guess a random number that has been generated.
*/
import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be ") + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
            count++;
        }
    }

    
}