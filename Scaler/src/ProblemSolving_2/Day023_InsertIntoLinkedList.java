package ProblemSolving_2;

public class Day023_InsertIntoLinkedList  {

	public static void main(String[] args) {
		int position=6;
		
		Node head=createLinkedList();
		Node temp=head;
		int size=0;
		while(temp!=null) {
			size++;
			temp=temp.next;
		}
		System.out.println("Size of Linked List: "+size);
		Node nn=new Node(55);
		head=insertNode(head,position,nn,size);
		Node temp1=head;
		while(temp1!=null) {
			System.out.println(temp1.data+" ");
			temp1=temp1.next;
		}
		
	
	}
	
	private static Node insertNode(Node head, int position, Node nn,int size) {
		
		Node temp=head;
		
		if(position==0) {
			nn.next=head;
			head=nn;
			return head;
		}
		else if(position>size) {
			return head;
		}
		else {
			int i=0;
			while(i<position-1) {
				temp=temp.next;
				i++;
			}
			nn.next=temp.next;
			temp.next=nn;
			return head;
		}
		
	}
		

	private static Node createLinkedList() {
		Node head=new Node(0);
		Node temp=head;
		for(int i=1;i<6;i++) {	
			Node newNOde=new Node(i*5);
			System.out.println(newNOde.data+" ");
			temp.next=newNOde;
			temp=temp.next;
			System.out.println(temp.data+" ");
		}
		
		return head;
	}

}
