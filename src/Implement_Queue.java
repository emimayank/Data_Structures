import java.util.Scanner;

public class Implement_Queue {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the Queue");
		int queue_size = input.nextInt();
		Queues queue = new Queues();
		queue.initialize_queue(queue_size);
		for(int i= 0;i<queue_size;i++){
			System.out.println("Enter the Element for the Queue");
			int element = input.nextInt();
			queue.enqueue(element);
		}
		queue.dequeue();
		queue.display_queue();
		

	}

}
