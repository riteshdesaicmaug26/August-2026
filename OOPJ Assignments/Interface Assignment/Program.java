package org.ritesh;

public class Program {

	public static int totalSides(RegularPolygon[] polygons) {
		int total = 0;
		
		for(int iTemp = 0; iTemp < polygons.length; iTemp++) {
			total += polygons[iTemp].getNumSides();
		}
		
		return total;
	}
	
	public static void main(String[] args) {
			 
		EquilateralTriangle triangle = new EquilateralTriangle(10);
		Square square = new Square(4);
		
			System.out.println("Equilateral Triangle");
			System.out.println("Number of sides: " + triangle.getNumSides());
			System.out.println("Side Length: " + triangle.getSideLength());
			System.out.println("Perimeter: " + triangle.getPerimeter());
			System.out.println("Interior Angle: " + triangle.getInteriorAngle() + " radians");
			
			
			System.out.println("\nSquare");
			System.out.println("Number of sides: " + square.getNumSides());
			System.out.println("Side Length: " + square.getSideLength());
			System.out.println("Perimeter: " + square.getPerimeter());
			System.out.println("Interior Angle: " + square.getInteriorAngle() + " radians");

		
		// Create RegularPolygon array
		RegularPolygon[] polygons = {triangle, square};
		
		System.out.println("\nTotal number of sides: " + totalSides(polygons));
		
 
	}

}
