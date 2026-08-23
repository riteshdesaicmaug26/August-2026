import java.util.Scanner;
import java.util.Arrays;
 
public class CheckSpecificElementInArray {

  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  Integer[] numbers = new Integer[5];

    System.out.println("Enter 5 integers");

    for(int i = 0; i < 5; i++) {
      numbers[i] = sc.nextInt();
    }
  
    System.out.println("Enter the number to search: ");
    int check = sc.nextInt();

      if(Arrays.asList(numbers).contains(check)) {
        System.out.println("Found");
      } else {
        System.out.println("Not Found");      
      }

  }
}
      
