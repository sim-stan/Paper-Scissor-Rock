package Training;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String SCISSORS = "Scissors";
        String PAPER = "Paper";
        String ROCK = "Rock";

        System.out.println();
        System.out.println("Choose [s]issors, [p]aper, [r]ock: ");

        String playerMove;
        String[] rps = {"r", "p", "s"};

        String computerMove = rps[new Random().nextInt(rps.length)];


        int computerWin = 0;
        int playerWin = 0;
        boolean isValid=false;
        playerMove = scanner.nextLine();
            while (true) {

                while (true) {

                    if (playerMove.equals("s")) {
                        playerMove = SCISSORS;
                        isValid=false;
                        break;

                    } else if (playerMove.equals("p")) {
                        playerMove = PAPER;
                        isValid=false;
                        break;

                    } else if (playerMove.equals("r")) {
                        playerMove = ROCK;
                        isValid=false;
                        break;
                    }else {
                        System.out.println("Invalid Input. Try Again...");
                        isValid = true;
                        System.out.println();
                        break;
                    }
                }

                if (!isValid) {
                    switch (computerMove) {

                        case "s":
                            computerMove = SCISSORS;
                            break;

                        case "p":
                            computerMove = PAPER;
                            break;

                        case "r":
                            computerMove = ROCK;
                            break;
                        default:
                            return;
                    }

                    System.out.printf("Computer Choose: %s%n", computerMove);

                    System.out.printf("Player Choose: %s%n", playerMove);
                    System.out.println();


                    if (playerMove.equals(computerMove)) {
                        System.out.printf("This Game was a Draw%n");

                    } else if (playerMove.equals(ROCK)) {
                        if (computerMove.equals(PAPER)) {
                            System.out.println("You lose!");
                            computerWin++;

                        } else if (computerMove.equals(SCISSORS)) {
                            System.out.println("You win!");
                            playerWin++;
                        }
                    } else if (playerMove.equals(PAPER)) {
                        if (computerMove.equals(ROCK)) {
                            System.out.println("You win!");
                            playerWin++;

                        } else if (computerMove.equals(SCISSORS)) {
                            System.out.println("You lose!");
                            computerWin++;
                        }
                    } else if (playerMove.equals(SCISSORS)) {
                        if (computerMove.equals(PAPER)) {
                            System.out.println("You win!");
                            playerWin++;

                        } else if (computerMove.equals(ROCK)) {
                            System.out.println("You lose!");
                            computerWin++;
                        }

                    }


                    int result = Math.abs(computerWin - playerWin);

                    if ((computerWin >= 2 && computerWin > playerWin) || (playerWin >= 2 && playerWin > computerWin)) {
                        if (result == 2) {
                            break;
                        }
                    }

                    System.out.printf("Result %d : %d%n", computerWin, playerWin);
                    System.out.println();
                }
                System.out.println("Choose [s]issors, [p]aper, [r]ock: ");

                playerMove = scanner.nextLine();
                computerMove = rps[new Random().nextInt(rps.length)];

            }
              if (playerWin > computerWin) {
            System.out.println();
            System.out.printf("Player is the winner!!! Result is Player %d : Computer %d%n", playerWin, computerWin);

              } else {
            System.out.println();
            System.out.printf("Computer is the winner!!! Result is Computer %d : Player %d%n", computerWin, playerWin);
        }
    }
}
