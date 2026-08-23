public class Pattern3 {

public static void main(String[] args)  {

  int n = 9;

  for(int i = 1; i <= n; i++) {

    for(int j = 1; j <= i; j++){
      if(j%2 != 0){
        System.out.print(j);
      }

      if(j < i) {
        System.out.print("*");
      }
    }

    System.out.println();
  }

 }
}

    