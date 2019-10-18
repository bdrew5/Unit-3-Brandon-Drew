import java.util.Scanner;

public class StringCutter {
  public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string you want to check: ");
        String word1 = scan.next();
        int length = word1.length();
        int last = (length - 1);
        int value1 = 0;

        while (last >= value1)
        {

          System.out.println(word1.charAt(value1));
          value1 = value1 + 1;
        }
      }
    }
