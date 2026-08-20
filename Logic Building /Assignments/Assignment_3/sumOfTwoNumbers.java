import java.util.Scanner;

public class sumOfTwoNumbers {
  
  public static int sumOfTwoNumbers(int a, int b) {
    return a + b;
  }

public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
      int num1 = sc.nextInt();

    System.out.println("Enter second number: ");
      int num2 = sc.nextInt();
  
    int sum = sumOfTwoNumbers(num1, num2);

    System.out.println("Sum of two numbers is : " + sum);

   }
}



