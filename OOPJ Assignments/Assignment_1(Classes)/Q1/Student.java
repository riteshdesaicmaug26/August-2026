
public class Student {
String name;
int roll_no;
String phone_no;
String address;

     public static void main(String[] args) 
     {

	
	//a.  Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
			Student obj1 = new Student();
			
			obj1.roll_no = 2;
			obj1.name = "John";
			
			
	//b. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
			Student obj2 = new Student();
			Student obj3 = new Student();
			
			obj2.roll_no = 3;
			obj2.name = "Sam";
			obj2.phone_no = "7846589805";
			obj2.address = "Panvel, Navi Mumbai";
			
			
			obj3.roll_no = 4;
			obj3.name = "John";
			obj3.phone_no = "9946579215";
			obj3.address = "Waghbil, Mumbai";
     
     
     
			System.out.printf(" %-10s %-10s %-15s %-20s%n", "Name", "Roll No", "Phone No", "Address");
			System.out.printf(" %-10s %-10s %-15s %-20s%n", obj2.name, obj2.roll_no, obj2.phone_no, obj2.address);
			System.out.printf(" %-10s %-10s %-15s %-20s%n", obj3.name, obj3.roll_no, obj3.phone_no, obj3.address);
			
     }

	

}
