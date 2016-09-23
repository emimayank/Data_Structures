
public class Doubly_Linked_List {
	public Doubly_Linked_List prev;
	public int data;
	public Doubly_Linked_List next;
	public Doubly_Linked_List(Doubly_Linked_List prev, int data, Doubly_Linked_List next){
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	public String toString(){
		return data+"";
	}
}
