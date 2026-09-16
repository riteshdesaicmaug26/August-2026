
public class Triangle {

   Triangle(int sideA, int sideB, int sideC)
   {
	   double area = 0.5 * sideA * sideB;
	   int perimeter = sideA + sideB + sideC;
	   
	   System.out.println("Area of triangle is: " + area);
	   System.out.println("Perimeter of triangle is: " + perimeter);
   }

	public static void main(String[] args) {

		Triangle obj = new Triangle(3, 4, 5);
	}

}
