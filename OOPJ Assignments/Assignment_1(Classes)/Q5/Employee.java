
public class Employee {

	public int getInfo(int salary, int hoursOfWork){	
		int finalSalary = salary + addSal(salary) + addWork(hoursOfWork);
		
		return finalSalary;
	}
	
	public int addSal(int salary) {
		int bonus;
		if(salary < 500) {
			bonus = 10;
		}
		else {
			bonus = 0;
		}
		return bonus;
	}
	
	public int addWork(int hoursOfWork) {
		int incentive;
		
		if(hoursOfWork > 6) {
			 incentive =  5;
		}
		else {
			 incentive =  0;
		}
		
		return incentive;
	}
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		System.out.println("Enter salary: ");
		int salary = ConsoleInput.getInt();
		System.out.println("Enter number of hours of work per day: ");
		int hoursOfWork = ConsoleInput.getInt();
		
		
		System.out.println("Final Salary: " + obj.getInfo(salary, hoursOfWork));

	}

}
