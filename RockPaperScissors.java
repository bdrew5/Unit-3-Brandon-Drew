import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Pick Rock, Paper, or Scissors")
    String rps = scan.next()
    int num = rand.nextInt(3) + 1;
  }
}
