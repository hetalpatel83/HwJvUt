import java.util.Scanner;


//Enter any string and count total number of 'a' in that String
public class TotalNumberOfaInString
{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter a string5");
  char Char;
  int count;
  String a =scanner.nextLine();
  a = a.toLowerCase();
  for (Char = 'a'; Char == 'a'; Char++)
  {
  count = 0;
  for (int i = 0; i < a.length(); i++)
  {
  if (a.charAt(i) == Char)
  {
  count++;
  }
  }
  System.out.println("Number of occurences of " + Char + " is " + count);
  }
}
}
