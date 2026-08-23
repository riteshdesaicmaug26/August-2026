import java.util.Scanner;

  class FactorialOfNumber {

    public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a number:");
      int N = sc.nextInt();
     
      int factorial = 1;

      for(int i = N; i >= 1; i--) {
      
          factorial = factorial * i;
      }
 
      System.out.println("Factorial of " + N + " is " + factorial);

    }
  
  }