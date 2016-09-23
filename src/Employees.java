
public class Employees extends Person {
	private int salary;
	
	public Employees(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "Name "+getName()+"Salary: "+getSalary();
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
