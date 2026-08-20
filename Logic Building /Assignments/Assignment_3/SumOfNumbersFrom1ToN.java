import java.util.Scanner;

public class SumOfNumbersFrom1ToN {

  public static void calculateSum(int n) {
    
  int sum = 0;
  
      for(int i = 1; i <= n; i++) {
      
          sum = sum + i;
      }
  
  System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);

  }

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a number:");
  int n = sc.nextInt();
 
  calculateSum(n);
  
 }
}
  
  