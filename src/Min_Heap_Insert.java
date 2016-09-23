
public class Min_Heap_Insert {
	public static int array[];
	public static int heapsize=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert(2);
	}
	private static void insert(int i) {
		// TODO Auto-generated method stub
		if(heapsize==0){
			array[heapsize++]=i;
			return;
		}
		else{
			array[heapsize++]=i;
			heapify(array[heapsize-1],heapsize-1);
			
		}

	}
	private static void heapify(int element, int position) {
		// TODO Auto-generated method stub
		int index_parent=position/2;
		if(array[index_parent]>element){
			int temp=element;
			array[position]=array[index_parent];
			array[index_parent]=temp;
			heapify(array[index_parent], index_parent);
			
		}
	}

}
