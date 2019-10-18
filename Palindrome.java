import java.util.Scanner;


public class Palindrome {
  public static void main(String [] args) {
        String letter1 = "";
        String letter2 = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string you want to check: ");
        String word1 = scan.next();
        int length = word1.length();
        int last = (length - 1);
        int first = 0;
        String word2 = word1.toLowerCase();

        while (last > first)
        {
          letter1 = letter1 + word2.charAt(first);
          letter2 = letter2 + word2.charAt(last);
          int result = letter1.compareTo(letter2);

          if (result != 0) {
            break;
          }

          else {
            last = last - 1;
            first = first + 1;
      }
    }

        if ((last - first) != 0) {
        System.out.println("The string is not palindrome");
      }
        else
        System.out.println("The string is a palindrome");
    }
  }
