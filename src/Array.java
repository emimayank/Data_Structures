
public class Array {

	public static void main(String[] args) {
		int [] array = new int[20];
		for(int i=0;i<5;i++){
			array[i]=i;
		}
		for(int i=0;i<5;i++){
			System.out.println(array[i]);
		}
		array[19]=100;
		for(int i:array){
			System.out.println(i);
		}
		

	}

}
