import java.util.Scanner;

public class Implement_Double {

	public static void main(String[] args) {
		System.out.println("Enter the first Element");
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		Doubly_Linked_List fdd = new Doubly_Linked_List(null, data, null);
		System.out.println("Enter the second Element");
		data = input.nextInt();
		Doubly_Linked_List sdd = new Doubly_Linked_List(null, data, fdd);
		fdd.prev= sdd;
		System.out.println("Enter the third Element");
		data = input.nextInt();
		Doubly_Linked_List tdd = new Doubly_Linked_List(null, data, fdd);
		sdd.prev=tdd;
		Doubly_Linked_List temp = new Doubly_Linked_List(null, 0, null);
		temp=tdd;
		while(data!=0){
			System.out.println("Enter the next Element");
			data = input.nextInt();
			Doubly_Linked_List ndd = new Doubly_Linked_List(null, data, temp);
			temp.prev=ndd;
			temp=ndd;
		}
		Doubly_Linked_List temp2 = new Doubly_Linked_List(null, 0, null);
		//temp2=ndd;
		while(fdd.prev!=null){
			System.out.println(fdd);
			fdd=fdd.prev;
		}

	}

}
