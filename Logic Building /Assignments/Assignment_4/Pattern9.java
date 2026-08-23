public class Pattern9 {
 
public static void main(String[] args) {
  
//Upper Triangle
  int n = 6;

  for(int i = 1; i <= n; i++) {
 
     //For spaces
     for(int j = 1; j <= n-i; j++) {
       System.out.print(" ");
     }

     //For Stars
     for(int j =1; j <= 2*i-1; j++) {
       System.out.print("*");
     }
  
    System.out.println(); 
  }

//Lower Triangle
int m = 5;
  
  for(int i = 1; i <= m; i++) {
    
    //For Spaces
    for(int j = 1; j <= i; j++) {
      System.out.print(" ");
    }

    //For Stars
     for(int j = i; j <= 2*m-i ; j++) {
     System.out.print("*");
     }
   
    System.out.println();
  }
  
}
}

 
