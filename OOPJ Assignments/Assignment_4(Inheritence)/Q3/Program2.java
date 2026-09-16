
public class Program2 {

	public static void main(String[] args) {		
		
		System.out.println("Enter Length: ");
		double length = ConsoleInput.getDouble();
		System.out.println("Enter Breadth: ");
		double breadth = ConsoleInput.getDouble();
		
		if(length == breadth) 
		{
		    Square obj2 = new Square(length, breadth);
		    System.out.println("Area of square: " + obj2.area());
		    System.out.println("Perimeter of square: " + obj2.perimeter());
		}
		else
		{
			Rectangle obj1 = new Rectangle(length, breadth);
		    System.out.println("Area of Rectangle: " + obj1.area());
		    System.out.println("Perimeter of Rectangle: " + obj1.perimeter());
		}
		
		
		
			
	}
}
