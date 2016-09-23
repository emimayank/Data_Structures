import java.util.HashSet;

public class Hash_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>set1=new HashSet<>();
		int array[]={1,2,2,4,1,5,8,9,10,11};
		for(int i=0;i<array.length;i++){
			set1.add(array[i]);
		}
		Integer nums[]=new Integer[8];
		set1.toArray(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}

}
