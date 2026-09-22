
public class GetIndex {

	public static void main(String[] args) {

    String alphabet =  "The quick brown fox jumps over the lazy dog";
    
    alphabet = alphabet.toLowerCase();

       for(char ch = 'a'; ch <= 'z'; ch++) {
    	 System.out.print(ch + "   ");
       }
       
       System.out.println("\n=======================================================================================================");
       
       for(char ch = 'a'; ch <= 'z'; ch++) {
    	   int index = alphabet.indexOf(ch);
    	   
    	   if(index < 9)
    	   System.out.print(index + "   ");
    	   
    	   else
    	   System.out.print(index + "  ");
    		   
       }
    
	}

}
