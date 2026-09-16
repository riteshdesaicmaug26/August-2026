
public class Program1 {

	public static void main(String[] args) {
		 // 1.
	    ComplexNumber[] ComplexArr = new ComplexNumber[5];
	    
	    System.out.println("\n============ Compute Complex Number ============");
	    
	    for(int iTemp = 0; iTemp < 5; iTemp++) {
	    	ComplexArr[iTemp] = new ComplexNumber();
	    	
	    	System.out.println("\nEnter details for complex number " + (iTemp + 1) + ": ");
	        
	    	System.out.println("\nEnter Number 1: "); 
	        int n1 = ConsoleInput.getInt();
	        
	        System.out.println("\nEnter Number 2: ");   	
	        int n2 = ConsoleInput.getInt();
	        
	        ComplexArr[iTemp].setNumber1(n1);
	        ComplexArr[iTemp].setNumber2(n2);
	    }
	    
	  //1.1 Display Result
	    for(int iTemp = 0; iTemp < 5; iTemp++) {
	    	int result = ComplexArr[iTemp].computeComplexNumber();
	    
	    	System.out.println("\nComplex Number " + (iTemp + 1) + ": " +
	    	ComplexArr[iTemp].getNumber1() + " * " +
	    	ComplexArr[iTemp].getNumber2() + " = " +
	    	result);
	    }

	}

}
