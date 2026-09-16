
public class Square extends Rectangle {
	
	Square(){		
	}
	
	Square(double length, double breadth){
		super(length, breadth);
		
	}
	
	public double area() {
		
		return length * breadth;
	}

	public double perimeter() {
		
		return 4 * length;
	}
}
