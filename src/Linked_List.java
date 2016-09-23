

public class Linked_List {
	public int data;
	public Linked_List next;
	public Linked_List(int data, Linked_List next){
		this.data = data;
		this.next = next;
	} 
	public String toString(){
		return data+"";
	}
	public void display_from_link(Linked_List list){
		Linked_List l = new Linked_List(0, null);
		l = list;
		while(l.next!=null){
			System.out.println(l);
			l=l.next;
		}
		System.out.println(l);
	}
	public void delete_link_at_node(int j, Linked_List sixth){
 		Linked_List l = new Linked_List(0, null);
		l = sixth;
		int count =1;
		while(l.next!=null){
			if (count==j){
				l.next = l.next.next;
				break;
			}
			l=l.next;
			count= count+1;
		}
	}
}
