import java.util.Scanner;

//Input any number and check if it is Armstrong number or not
public class ArmstrongNumber {
  public static void main(String args[]) {

  //Defining object in main method
  //Assign the variable value
  int n, sum = 0, temp, remainder, digits = 0;
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the number");
  n = scanner.nextInt();
  temp = n;

 // Count number of digits
  while (temp != 0)
  {
  digits++;
  temp = temp/10;
  }
  temp = n;
  while (temp != 0)
  {
  remainder = temp%10;
  sum = sum + (remainder+ digits);
  temp = temp/10;
  }
  if (n == sum)
  System.out.println(n + " is an Armstrong number.");
  else
  System.out.println(n + " is not an Armstrong number.");
  }
}

