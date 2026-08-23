import java.util.Scanner;

public class CountVowelsInString {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a string: ");
    String str = sc.nextLine();

    int vowels = 0;   
    str = str.toLowerCase();

    for(int i = 0; i < str.length(); i++) {
    
             if(str.charAt(i) == 'a' ||
                str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u') {

              vowels = vowels + 1;
        }
    }
 
    System.out.println("The number of vowels in " + str + " is: " + vowels);
 }
}