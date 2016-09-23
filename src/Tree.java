
public class Tree {
	public int val;
	public Tree left_child;
	public Tree right_child;
	public Tree parent;
	public Tree(int val, Tree left_child, Tree right_child, Tree parent){
		this.val=val;
		this.left_child=left_child;
		this.right_child=right_child;
		this.parent=parent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t1=new Tree(1, null, null, null);
		Tree t2=new Tree(2, null, null, t1);
		Tree t3=new Tree(3, null, null, t1);
		Tree t4=new Tree(4, null, null, t2);
		Tree t5=new Tree(5, null, null, t2);
		Tree t6=new Tree(6, null, null, t3);
		Tree t7=new Tree(7, null, null, t3);
		t1.left_child=t2;
		t1.right_child=t3;
		t2.left_child=t4;
		t2.right_child=t5;
		t3.left_child=t6;
		t3.right_child=t7;
		Tree temp=t1;
		System.out.println("Post Order Traversal");
		post_order(temp);
		System.out.println("In Order Traversal");
		in_order(temp);
		System.out.println("Pre Order Traversal");
		pre_order(temp);
		
	}
	private static void pre_order(Tree temp) {
		// TODO Auto-generated method stub

		if(temp!=null){
			System.out.println(temp.val);
			pre_order(temp.left_child);
			pre_order(temp.right_child);
		}

	}
	private static void in_order(Tree temp) {
		// TODO Auto-generated method stub

		if(temp!=null){
			in_order(temp.left_child);
			System.out.println(temp.val);
			in_order(temp.right_child);
		}
		
	}
	private static void post_order(Tree temp) {
		// TODO Auto-generated method stub

		if(temp!=null){

			post_order(temp.left_child);
			post_order(temp.right_child);
			System.out.println(temp.val);
		}
	}
	


}
