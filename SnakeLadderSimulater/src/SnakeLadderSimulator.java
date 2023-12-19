import java.util.Random;
import java.util.Scanner;

public class SnakeLadderSimulator {

    private static int rollDie() {
        return new Random().nextInt(6) + 1;
    }

    private static int playTurn(int player, int position) {
        System.out.print("Player " + player + ", press Enter to roll the die...");
        new Scanner(System.in).nextLine();

        int diceRoll = rollDie();
        System.out.println("Player " + player + " rolled a " + diceRoll + ".");

        int option = new Random().nextInt(3); // 0: No Play, 1: Ladder, 2: Snake

        switch (option) {
            case 0:
                System.out.println("No Play. Player " + player + " stays in the same position.");
                // No change in position
                break;
            case 1:
                int newPosition = position + diceRoll;
                if (newPosition <= 100) {
                    System.out
                            .println("Player " + player + " found a ladder. Move ahead by " + diceRoll + " positions.");
                    position = newPosition;
                    position = playTurn(player, position); // Player gets another turn after a ladder
                } else {
                    System.out.println(
                            "Player " + player + " needs " + (100 - position) + " to reach the goal. Try again.");
                }
                break;
            case 2:
                System.out
                        .println("Oops! Snake bite. Player " + player + " moves behind by " + diceRoll + " positions.");
                position -= diceRoll;
                if (position < 0) {
                    position = 0; // Restart from position 0 if it goes below 0
                }
                break;
        }

        System.out.println("Player " + player + "'s current position is " + position + ".");
        return position;
    }

    private static void playSnakeAndLadder() {
        int player1Position = 0;
        int player2Position = 0;

        while (player1Position < 100 && player2Position < 100) {
            player1Position = playTurn(1, player1Position);

            if (player1Position >= 100) {
                System.out.println("Player 1 won the game!");
                break;
            }

            player2Position = playTurn(2, player2Position);

            if (player2Position >= 100) {
                System.out.println("Player 2 won the game!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        playSnakeAndLadder();
    }
}
