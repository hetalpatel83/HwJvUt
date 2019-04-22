import java.util.Scanner;

//print Fibonacci series of number terms where number is input by user
public class FibonacciSeries
{
 public static void main(String[] args)
{
  //int count
  int maxNumber = 0;
  int previousNumber = 0;
  int nextNumber = 1;

  System.out.println("How many numbers do you want in Fibonacci:");
  Scanner scanner = new Scanner(System.in);
  maxNumber = scanner.nextInt();
  System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
  for (int i = 1; i <= maxNumber; ++i)
{
  System.out.print(previousNumber+" ");
 //Sum of previous two numbers
  int sum = previousNumber + nextNumber;
  previousNumber = nextNumber;
  nextNumber = sum;
}
}

}
