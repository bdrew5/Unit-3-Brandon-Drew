import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("If you would like to play rock paper scissors enter y. If not enter n");
    //Testing if user wants to play rock paper scissors
    String yn = scan.next();
    int game = yn.compareTo("y");
    int win = 0;
    int total = 0;

    while (game == 0){
    System.out.println("Pick Rock, Paper, or Scissors");
    String rps1 = scan.next();
    rps1 = rps1.toLowerCase();
    int num = rand.nextInt(3) + 1;
    String rps2;

    if (num == 1)
    rps2 = "Rock";
    else if (num == 2)
    rps2 = "Paper";
    else
    rps2 = "Scissors";

    String rock = "rock";
    String paper = "paper";
    String scissors = "scissors";

    int r = rps1.compareTo(rock);
    int p = rps1.compareTo(paper);
    int s = rps1.compareTo(scissors);

    if (r == 0 && num == 1){
    System.out.println("It's a tie, we both picked rock");
    total = total + 1;
  }

    else if (r == 0 && num == 2){
    System.out.println("I won, paper beats rock");
    System.out.println("Would you like to play again?");
    yn = scan.next();
    game = yn.compareTo("y");
    total = total + 1;
  }

    else if (r == 0 && num == 3){
    System.out.println("You won, rock beats scissors");
    System.out.println("Would you like to play again?");
    yn = scan.next();
    game = yn.compareTo("y");
    total = total + 1;
    win = win + 1;
  }

    else if (p == 0 && num == 1){
    System.out.println("You won, paper beats rock");
    System.out.println("Would you like to play again?");
    yn = scan.next();
    game = yn.compareTo("y");
    total = total + 1;
    win = win + 1;
  }

    else if (p == 0 && num == 2){
    System.out.println("It's a tie, we both picked paper");
    total = total + 1;
  }

    else if (p == 0 && num == 3){
    System.out.println("I won, scissors beats paper");
    System.out.println("Would you like to play again?");
    yn = scan.next();
    game = yn.compareTo("y");
    total = total + 1;
  }

    else if (s == 0 && num == 1){
    System.out.println("I won, rock beats scissors");
    System.out.println("Would you like to play again?");
    yn = scan.next();
    game = yn.compareTo("y");
    total = total + 1;
  }

    else if (s == 0 && num == 2){
    System.out.println("You won, scissors beats paper");
    System.out.println("Would you like to play again?");
    yn = scan.next();
    game = yn.compareTo("y");
    total = total + 1;
    win = win + 1;
  }

    else{
    System.out.println("It's a tie, we both picked scissors");
    total = total + 1;
  }


  }
  double winPercentage = (double) win / total;
  System.out.println("Your win percentage is " + (winPercentage*100) + "%");
  }
}
