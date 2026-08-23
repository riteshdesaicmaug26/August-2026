import java.util.Scanner;

public class  MultipleStringLiterals {

  public static void main(String[] args) {

 String s1 = "Ritesh";
 String s2 = "Ritesh";
 String s3 = "Ritesh";

 System.out.println("All strings point to the same object: " + (s1 == s2 && s2 == s3));

 }
}

