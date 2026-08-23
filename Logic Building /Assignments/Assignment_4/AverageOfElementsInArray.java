import java.util.Scanner;
  
public class AverageOfElementsInArray {

  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);

    double[] numbers = new double[];

    System.out.println("Enter 5 integers:");

    for(int i= 0; i < 5; i++) {
      numbers[i] = sc.nextDouble();
    }

    double sum = 0;
 
    for(double number : numbers) {
    sum = sum + number;
    }

    double average = sum / 5; 
   
    System.out.println("The average of the numbers is: " + average);
 
  }
}  
 
   
    