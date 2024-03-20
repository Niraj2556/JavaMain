//package testing;
//import javax.swing.JOptionPane;
//import java.util.Random;
//public class NumberGuessGame {
//
//        public static void main(String[] args) {
//            int lowerBound = 1;
//            int upperBound = 100;
//            int maxAttempts = 10;
//            int score = 0;
//            int rounds = 0;
//
//            JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!");
//
//            do {
//                int targetNumber = generateRandomNumber(lowerBound, upperBound);
//                int attempts = 0;
//
//                JOptionPane.showMessageDialog(null, "Round " + (rounds + 1));
//                JOptionPane.showMessageDialog(null, "Guess the number between " + lowerBound + " and " + upperBound);
//
//                while (attempts < maxAttempts) {
//                    int userInput = getUserInput();
//                    attempts++;
//
//                    if (userInput == targetNumber) {
//                        score += calculateScore(maxAttempts, attempts);
//                        JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
//                        break;
//                    } else if (userInput < targetNumber) {
//                        JOptionPane.showMessageDialog(null, "Try again. The number is lower. Attempt left " + (10 - attempts));
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Try again. The number is higher. Attempt left " + (10 - attempts));
//                    }
//                }
//
//                if (attempts == maxAttempts) {
//                    JOptionPane.showMessageDialog(null, "Sorry, you have reached the maximum number of attempts. The number was: " + targetNumber);
//                }
//
//                rounds++;
//            } while (playAgain());
//
//            JOptionPane.showMessageDialog(null, "Game over! Your final score is: " + score);
//        }
//
//        private static int generateRandomNumber(int lowerBound, int upperBound) {
//            Random random = new Random();
//            return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
//        }
//
//        private static int getUserInput() {
//            int input;
//            try {
//                input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your guess:"));
//            } catch (NumberFormatException e) {
//                // If the input is not a valid integer, set input to an out-of-range value
//                input = -1;
//            }\
//        }
//
//}
