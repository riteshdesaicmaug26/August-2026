
public class Rectangle {
protected double length;
protected double breadth;

Rectangle(){
	
}

Rectangle(double length, double breadth){
	this.length = length;
	this.breadth = breadth;
}

public double area() {

	return length * breadth;
}

public double perimeter() {
	
	return 2 * (length + breadth);
}



}
