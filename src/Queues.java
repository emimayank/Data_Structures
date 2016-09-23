public class Queues {
	private int queue[];
	private static int end_pointer=0;
	private static int start_pointer=0;
	public void initialize_queue(int queue_size){
		queue = new int[queue_size];
	}
	public void enqueue(int element){
		queue[end_pointer]=element;
		end_pointer=end_pointer+1;
	}
	public int dequeue(){
		start_pointer= start_pointer+1;
		return queue[start_pointer-1];

	}
	public void display_queue(){
		for(int i= start_pointer;i<end_pointer;i++){
			System.out.println(queue[i]);
		}
	}
}
