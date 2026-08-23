import java.util.Scanner;

public class NamesInStringArray {
 
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  String[] names = new String[4];
  
  System.out.println("Enter 4 Names:");

  for(int i = 0; i < 4; i++) {
    names[i] = sc.next();
  }
  
  for(String name : names) {
    System.out.print(name + " ");
  }

 }
} 
  