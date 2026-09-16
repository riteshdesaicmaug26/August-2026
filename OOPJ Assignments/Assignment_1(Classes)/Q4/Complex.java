
public class Complex {

	int Sum(int real, int imaginary) 
	{
		return real + imaginary;
	}
	
	int Difference(int real, int imaginary) 
	{
		return real - imaginary;
	}
	
	int Product(int real, int imaginary) 
	{
		return real * imaginary;
	}
	
	
	public static void main(String[] args) {
		
		Complex obj = new Complex();
		
        System.out.println("Enter Real Number: ");
        int real = ConsoleInput.getInt();
        
        System.out.println("Enter Imaginary Number: ");
        int imaginary = ConsoleInput.getInt();
		
		
		System.out.println("Sum of Complex Two Numbers: " + obj.Sum(real, imaginary));
		System.out.println("Difference of Two Complex Numbers: " + obj.Difference(real, imaginary));
		System.out.println("Product of Two Complex Numbers: " + obj.Product(real, imaginary));
		
		}
}
