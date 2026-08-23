import java.util.Scanner;

public class StringConcatination  {

  public static void main(String[] args) {
  
  String s1 = new String("Ritesh");
  String s2 = new String("Desai");

  String s3 = s1 + s2;

  System.out.println("Is s3 pointing to the same object as s1?" + (s3 == s1));

  }
}

  
