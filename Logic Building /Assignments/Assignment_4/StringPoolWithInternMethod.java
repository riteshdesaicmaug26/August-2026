import java.util.Scanner;

public class StringPoolWithInternMethod  {

  public static void main(String[] args) {

  String s1 = new String("Ritesh");
  String s2 = s1.intern(); 

  String s3 = "Ritesh";

  System.out.println("Is str2 and str3 pointing to the same object? " + (s2 == s3));
 
  }
}