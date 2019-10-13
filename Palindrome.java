import java.util.Scanner;

<<<<<<< HEAD
public class Palindrome
{
    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        String word1 = scan.nextLine();
        int length = word1.length();

        int l = length;
        int a = 0;
        
        while ((l - a) > 0)
        {
            String letter1 = (letter1) + word1.charAt(a);
            String letter2 = (letter2) + word1.charAt(l);
            int result = letter1.compareTo(letter2);

            if (result != 0) {
            break;
          }
          l = l--;
          a = a--;
        }

        if ((a - l) > 0 ){
        System.out.println("The string is not palindrome.");
      }
        else
        System.out.println("The string is a palindrome");
    }
=======
public class Palindrome{
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a word that is a palindrome");
    String word1 = scan.next();


  }
>>>>>>> ad7d246a8a6b88d505d5bba2b8e7c1207d671020
}
