import java.util.Scanner;

//Print single multiplication table using for loop for given number
public class MultiplicationTableForLoop
{
  public static void main(String[] args)
 {
  int a, c;
  System.out.println("Enter number for multiplication table");
  Scanner scanner = new Scanner(System.in);
  a = scanner.nextInt();
  System.out.println("Multiplication table of " + a);
  int num = a, b = 1;
  for (c = 1; c <= 10; c++)
  System.out.println(a + "*" + c + " = " + (a*c));
 }

}

