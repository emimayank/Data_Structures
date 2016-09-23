public class Stacks {
	private int stack_size;
	private int StackArray[];
	private static int t;
	public void initialize(int stack_size){
		t=-1;
		StackArray = new int[stack_size];
	}
	public void push(int x){
		t=t+1;
		StackArray[t]=x;
	}
	public int pop(){
		t=t-1;
		return StackArray[t+1];
	}
	public void set_stack_size(int size){
		this.stack_size = size;
	}
	public void display_stack(){
		while(t!=-1){
			System.out.println(StackArray[t]);
			t=t-1;
		}
	}
}
