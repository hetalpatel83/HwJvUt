import java.util.Scanner;

//Input any five digit number and then find sum of each digit
public class SumOfFiveDigitNumber
{
  public static void main(String args[])
  {
  int a, b, sum = 0;
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter any 5 digits:");
  a = scanner.nextInt();
  while (a > 0)
  {
  b = a % 10;
  sum = sum + b;
   a = a / 10;
 }
  System.out.println("Sum of 5 digits:" + sum);
 }
}
