/* You are given A which is the head of a linked list. Print the linked list in space separated manner.

Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line
*/

package ProblemSolving_2;

public class Day023_Print_LinkedList extends Node{

	Day023_Print_LinkedList(int data) {
		super(data);
	}
	
	

	public static void main(String[] args) {
		
		Node head=createLinkedList();
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;		
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
