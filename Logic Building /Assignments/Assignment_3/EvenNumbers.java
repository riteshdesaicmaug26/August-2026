public class EvenNumbers{

  public static void printEvenNumbers(int num) {
  
    while(num <= 50) {
     
      if(num % 2 == 0) {
        System.out.print(num + " ");
      }
     
      num++;

    }
  }

  public static void main(String[] args) {
  int num = 1;
  printEvenNumbers(num);

  }  
 }
