
public class Student extends Person {
	private int credits;
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public Student(String name){
		super(name);
	}
	public String toString(){
		return "Name :"+getName()+"Credits :"+getCredits();
	}
	public static void main(String args[]){
		Student mayank=new Student("Mayank");
		mayank.setCredits(30);
		Student pramit=new Student("Pramit");
		pramit.setCredits(36);
		Employees varun=new Employees("Varun");
		Employees neyaz=new Employees("Neyaz");
		Person p[]={mayank,pramit,varun,neyaz};
		for(Person per:p){
			System.out.println(per);
		}
	}

}
