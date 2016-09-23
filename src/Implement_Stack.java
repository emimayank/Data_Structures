import java.util.Scanner;

public class Implement_Stack {

	public static void main(String[] args) {
		System.out.println("Enter the size of the Stack");
		Scanner input = new Scanner(System.in);
		int stack_size = input.nextInt();
		Stacks stacks = new Stacks();
		stacks.initialize(stack_size);
		for(int i=0;i<5;i++){
			System.out.println("Enter the element to be pushed");
			int element = input.nextInt();
			stacks.push(element);
		}
		stacks.display_stack();

	}

}
