public class PrimeMembers extends Member {
	
	 private int joiningYear; 
	 private double joiningFees;
	 private boolean isActive;
	
	public void display() {
	     
	 System.out.println("\n----- Member Details -----");
   	 System.out.println("Name: " + getName());
   	 System.out.println("Age: " + getAge());
   	 System.out.println("Phone Number: " + getPhoneNumber());
   	 System.out.println("Address: " + getAddress());
   	 System.out.println("Salary: " + getSalary());
		
   	 System.out.println("\n----- Prime Member Details -----");
	 System.out.println("Joining Year: " + getJoiningYear());
	 System.out.println("Joining Fees: " + getJoiningFees());
	 System.out.println("isActive: " + getIsActive());
	}
	
	// Getter
	public int getJoiningYear() {
		return joiningYear;
	}
	
	public double getJoiningFees() {
		return joiningFees;
	}
	
	public boolean getIsActive() {
		return isActive;
	}
	
	// Setter
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	public void setJoiningFees(double joiningFees) {
		this.joiningFees = joiningFees;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

}
