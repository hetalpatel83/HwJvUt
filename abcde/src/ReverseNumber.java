import java.util.Scanner;

//Input number & reverse it & print it using while loop
public class ReverseNumber
{
 public static void main(String args[])
{
 int n, reverse = 0;

 System.out.println("Enter numbers");
 Scanner scanner = new Scanner(System.in);
 n = scanner.nextInt();

 while(n != 0)
{
 reverse = reverse * 10;
 reverse = reverse + n%10;
 n = n/10;
}
 System.out.println("Reverse of the number is " + reverse);
 }

}
