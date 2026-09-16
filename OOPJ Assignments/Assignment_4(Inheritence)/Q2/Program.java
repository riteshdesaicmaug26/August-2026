
public class Program {
	 public static void main(String[] args) {
			
		  PrimeMembers member = new PrimeMembers();
		  
		  System.out.println("Enter Name: ");
		  member.setName(ConsoleInput.getString());
		  
		  System.out.println("Enter Age: ");
		  member.setAge(ConsoleInput.getInt());
		  
		  System.out.println("Enter Phone Number: ");
		  member.setPhoneNumber(ConsoleInput.getString());
		  
		  System.out.println("Enter Address: ");
		  member.setPhoneNumber(ConsoleInput.getString());
		  
		  System.out.println("Enter Salary: ");
		  member.setSalary(ConsoleInput.getFloat());
		  
		  System.out.println("Enter Joining Year: ");
		  member.setJoiningYear(ConsoleInput.getInt());
		  
		  System.out.println("Enter Joining Fees: ");
		  member.setJoiningFees(ConsoleInput.getFloat());
		  
		  System.out.println("Is Active (true/false): ");
		  member.setIsActive(Boolean.parseBoolean(ConsoleInput.getString()));
		  
		  member.display();
		  
	  }

}
