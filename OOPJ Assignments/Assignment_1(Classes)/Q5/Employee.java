
public class Employee1 {
String name;
int year_of_joining;
String address;

     public static void main(String[] args) 
     {

    	 Employee1 obj1 = new Employee1();
    	 Employee1 obj2 = new Employee1();
    	 Employee1 obj3 = new Employee1();
			

			obj1.name = "Robert";
			obj1.year_of_joining = 1994;
			obj1.address = "64C- WallsStreat";
			
			
			obj2.name = "Sam";
			obj2.year_of_joining = 2000;
			obj2.address = "68D- WallsStreat";
			
			
			obj3.name = "John";
			obj3.year_of_joining = 1999;
			obj3.address = "26B- WallsStreat";
     
     
     
			System.out.printf(" %-10s %-21s %-20s%n", "Name", "Year of joining ", "Address");
			System.out.printf(" %-15s %-15s %-20s%n", obj1.name, obj1.year_of_joining, obj1.address);
			System.out.printf(" %-15s %-15s %-20s%n", obj2.name, obj2.year_of_joining, obj2.address);
			System.out.printf(" %-15s %-15s %-20s%n", obj3.name, obj3.year_of_joining, obj3.address);
			
     }

	

}

