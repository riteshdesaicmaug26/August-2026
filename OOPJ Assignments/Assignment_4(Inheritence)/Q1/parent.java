
public class parent {

	public void displayParentClass() {
		System.out.println("This is parent class");
	}
		
	
	public static void main(String[] args) {

		parent objParent = new parent();
		// 1. Parent method by parent object
		objParent.displayParentClass();
		
		
		child objChild = new child();
		// 2. Child method by child object
		objChild.displayChildClass();
		
		
		// 3. Parent method by child object
		objChild.displayParentClass();
	}
}

class child extends parent {
	public void displayChildClass() {
		System.out.println("This is child class");
	}
}

