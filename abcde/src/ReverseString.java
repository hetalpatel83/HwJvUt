import java.util.Scanner;

//To Enter a String (eg:abcdef ) and
//Get the reverse of the String
public class ReverseString
{
   public static void main(String[] args)
   {
    System.out.println("Enter string :");
    Scanner sacnner = new Scanner(System.in);
    String string = sacnner.nextLine();
    StringBuilder sb = new StringBuilder(string);

    System.out.println("Reversed string is:");
    System.out.println(sb.reverse().toString());
    }
}
