import java.util.Scanner;

public class StringCreationWithNewKeyword  {

  public static void main(String[] args) {

  String s1 = new String("Ritesh");
  String s2 = new String("Ritesh");

  System.out.println("Using: " + (s1 == s2));
  System.out.println("Using: " + s1.equals(s2));

  }
}