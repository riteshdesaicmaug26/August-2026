import java.util.Scanner;
public class MultiplicationTable {

  public static void printMultiplicationTable(int n) {
  
      for(int i = 1; i <= 10; i++){
      
          int mul = n*i;

          System.out.println(n + " x " + i + " = " + mul);
      }
  } 


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
  
    System.out.println("Enter a number: ");
    
    int n = sc.nextInt();
    
    printMultiplicationTable(n);
  
  }
}
    
    
    
  