package org.ritesh;

interface RegularPolygon {

	int getNumSides();
	
	double getSideLength();
	
	default double getPerimeter() {
		return getNumSides() * getSideLength();
	}
	
	default double getInteriorAngle() {
		return (getNumSides() - 2) * 3.14/getNumSides();
	}
}
