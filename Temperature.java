import java.util.Scanner;

public class Temperature{
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What's the temperature?");
    int temp = scan.nextInt();
    if (temp > 83)
    System.out.println("It's hot");
    else if (temp >= 68)
    System.out.println("It's ideal");
    else if (temp >= 45)
    System.out.println("It's cool");
    else
    System.out.println("It's cold");
  }
}
