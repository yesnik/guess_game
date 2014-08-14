import java.util.Scanner;
import java.util.Random;


class GuessGame {

    private static void printMessage(String message) {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        printMessage("Hello, I guessed number from 1 to 15. Try to guess it!");
        int secretNum = new Random().nextInt(15) + 1;
        int triesLeft = 5;
        while (true) {
            if (triesLeft < 1) {
                printMessage("You've spent all tries. Game over. Sorry...");
                break;
            }
            printMessage("Your try:");
            int userNum = new Scanner(System.in).nextInt();
            triesLeft--;
            
            if (userNum == secretNum) {
                printMessage("Yes! You won!");
                break;
            } else {
                String message;
                if (triesLeft < 1) {
                    continue;
                } else if (triesLeft == 1) {
                    message = "No. This is your LAST TRY! Be careful!";
                } else {
                    message = "No. Try again. Tries left: " + triesLeft;
                }
                printMessage(message);
            }
        }
    }
}
