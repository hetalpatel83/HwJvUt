import java.util.Scanner;

//Print single multiplication table using do while loop for given number
public class MultiplicationTableDoWhileLoop
{
 public static void main(String[] args)
{
  int a, c;
  System.out.println("Enter number for multiplication table");
  Scanner scanner = new Scanner(System.in);
  a = scanner.nextInt();
  System.out.println("Multiplication table of " + a);
  int num = a, b = 0;
  do{
//int  =b*num;
  b++;
//%d means parse it as a decimal integer
  System.out.printf("%d * %d = %d \n", num, b, num * b);
}
while(b < 10);
{

        }
    }
}
