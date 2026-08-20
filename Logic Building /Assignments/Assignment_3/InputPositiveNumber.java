import java.util.Scanner;

public class InputPositiveNumber {

  public static void askForPositiveNumber() {
     
    Scanner sc = new Scanner(System.in);
    int n;
  
    do {
         System.out.println("Enter a positive number: ");
         n = sc.nextInt(); 
       }

    while(n < 0);


    if(n > 0) {
      
      System.out.println("You eneterd a positive number: " + n);

    }

  }
    

  public static void main(String[] args) {

   askForPositiveNumber();
  }

}
    
    
    