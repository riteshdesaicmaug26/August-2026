import java.util.Scanner;

class PrintNumbers1ToN {
  
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a number:"); 
  int N = sc.nextInt();

  for(int i = 1; i <= N; i++){
      System.out.print(i + " ");
  }
 }
}

  