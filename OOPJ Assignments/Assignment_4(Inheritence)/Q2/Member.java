
public class Member {
	
private String name;
private int age;
private String phone;
private String address;
private double salary;

        // Method to print salary
        public void printSalary() {
             System.out.println("Salary: " + salary);
        }
    	 
        // Getters

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getPhoneNumber() {
            return phone;
        }

        public String getAddress() {
            return address;
        }

        public double getSalary() {
            return salary;
        }

        // Setters

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhoneNumber(String phone) {
            this.phone = phone;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    	 
}


 


