import java.util.Scanner;

public class CheckAge {

  public static void checkAgeCategory(int a) {
    
    if(a < 18) {
      System.out.println("You are a minor");
      }

    else if(a < 60){
      System.out.println("You are an adult");
      }

    else {
      System.out.println("You are a senior citizen");    
      }

  }

 public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
    
   System.out.println("Enter your age: ");
   int age = sc.nextInt();
    
   checkAgeCategory(age);
  
  }
}
  

  
    