import java.util.Scanner;

public class Multiples {
  public static void main(String [] args) {
        int mult = 1;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = scan.nextInt();
        System.out.println("Enter an upper limit:");
        int limit = scan.nextInt();
        while (limit < num || num <= 0){
          if (limit < num) {
          System.out.println("The limit must be greater than the integer");
          System.out.println("Enter a new upper limit value");
          limit = scan.nextInt();
        }
          else {
            System.out.println("The integer must be greater than 0");
            System.out.println("Enter a new integer");
            num = scan.nextInt();
          }
        }
        int val = num;
        for (num = num; num <= limit; val = num * mult) {
        System.out.println(val);
        mult = mult + 1;
      }
      }
    }
