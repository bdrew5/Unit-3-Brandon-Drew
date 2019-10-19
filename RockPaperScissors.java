import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Pick Rock, Paper, or Scissors");
    String rps1 = scan.next();
    int num = rand.nextInt(3) + 1;
    String rps2;

    if (num == 1)
    rps2 = "Rock";
    else if (num == 2)
    rps2 = "Paper";
    else
    rps2 = "Scissors";

  }
}
