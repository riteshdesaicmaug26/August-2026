
public class ReverseString {

	public static void main(String[] args) {
		
		String str =  ("The quick brown fox jumps"); 
        String rev = "";
		System.out.println("The given string is: " + str);
		
		for(int iTemp = str.length() - 1; iTemp >= 0; iTemp--) {
			rev = rev + str.charAt(iTemp);
		}
		
		System.out.println("The string in reverse order is: " + rev);
	}

}
