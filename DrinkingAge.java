import java.util.Scanner;

public class DrinkingAge{
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = scan.nextInt();
    if (age >= 21)
    System.out.println("You are old enough to drink");
    else
    System.out.println("You aren't old enough to drink");
  }
}
