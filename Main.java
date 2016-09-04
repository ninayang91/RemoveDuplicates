import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(1);
		Node b=new Node(2,a);
		Node c=new Node(3,b);
		Node head=new Node(1,c);
		Node p=head;
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}
		deleteDups3(head);
		p=head;
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}

	}
	
	//remove duplicates from an unsorted linked list
	//use Hashtable to store each value,
	//set a node previous, if we meet the same one, move pointer, delete it
	public static void deleteDups(Node n){
		Hashtable ht=new Hashtable();
		Node previous=null;//previous could be set to any value, it doesn't matter;
		while(n!=null){
			if(ht.containsKey(n.data)){
				previous.next=n.next;
			}else{
				ht.put(n.data, true);
				previous=n;//previous will be first set to n
			}
			n=n.next;
		}
	}//time O(n) space O(n)
	
	public static void deleteDups2(Node n){
		Hashtable ht=new Hashtable();
		if(n==null)return;
		ht.put(n.data, true);
		while(n.next!=null){
			if(ht.containsKey(n.next.data)){
				n.next=n.next.next;
			}else{
				ht.put(n.next.data, true);
				n=n.next;
			}
			
		}
	}
	
	
	//if a temporary buffer is not allowed, we couldnot put data in hashtable
	//p refer to n, q refer to all the nodes after p to check the duplicates, if so, remove q
	public static void deleteDups3(Node n){
		if(n==null)return;
		for(Node p=n;p!=null;p=p.next){
			Node q=p;
			while(q.next!=null){
				if(p.data==q.next.data){
					q.next=q.next.next;
				}else{
					q=q.next;
				}
			}
		}


	}//Time O(n^2) Space O(1)
	




}
