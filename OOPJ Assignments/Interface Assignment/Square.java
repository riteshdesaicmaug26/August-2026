package org.ritesh;

 class Square implements RegularPolygon {

	 private double  sideLength;

		Square(double sideLength){
			this.sideLength = sideLength;
		}
		
		public int getNumSides(){
			return 4;
		}
		
		public double getSideLength(){
			return sideLength;
		}
		
	 
}
