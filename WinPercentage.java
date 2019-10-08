import java.util.Scanner;

public class WinPercentage{
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many games have you played?");
    int games = scan.nextInt();
    System.out.println("How many games have you played?");
    int won = scan.nextInt();

    while ((games <= 0) && (won > games) && (won < 0)) {
    while (games <= 0) {
      System.out.println("Total games played must be greater than 0");
      System.out.println("Enter new games played value");
      games = scan.nextInt();
    }
    while (won > games){
      System.out.println("Total games played must be greater or equal to total games won");
      System.out.println("Enter new games won or total games played numbers");
      System.out.println("Enter new games won number");
      won = scan.nextInt();
      System.out.println("Enter new games played number");
      games = scan.nextInt();
    }
    while (won < 0) {
      System.out.println("Wins must be greater or equal to 0");
      System.out.println("Enter new games won number");
      won = scan.nextInt();
    }
  }

    double percent = (double) won / games;
    double perc  = percent * 10;
    System.out.println("Your win percantage is " + perc + "%");
  }
}
