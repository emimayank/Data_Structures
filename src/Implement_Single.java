import java.util.Scanner;

public class Implement_Single {

	public static void main(String[] args) {
		Linked_List first = new Linked_List(15, null);
		Linked_List second = new Linked_List(25, first);
		Linked_List third = new Linked_List(35, second);
		Linked_List fourth = new Linked_List(45, third);
		Linked_List fifth = new Linked_List(55, fourth);
		Linked_List sixth = new Linked_List(65, fifth);

		//fourth.display_from_link(sixth);
		Linked_List linked = new Linked_List(0, null);
		linked.display_from_link(sixth);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the link to be deleted");
		int number = input.nextInt();
		if(number!=0){
			linked.delete_link_at_node(number,sixth);
		}
		linked.display_from_link(sixth);
		
	}

}
