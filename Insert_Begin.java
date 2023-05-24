public class Insert_Begin {
	public static class Node{
		int data;
		Node next;
		Node(int x){
			this.data=x;
			next=null;
		}
	}	
		static Node insertBegin(Node head,int x) {
			Node temp=new Node(x);
			temp.next=head;
			head=temp;
			return temp;
		}
		public static void main(String[] args) {
			Node head=null;
			head=insertBegin(head,30);
			head=insertBegin(head,20);
			head=insertBegin(head,10);
		}

}

