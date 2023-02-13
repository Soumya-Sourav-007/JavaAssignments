package Day_14_Java_Assignments.LinkedListProblems;

class Node{
	int data;
	Node next;
	Node(int data){
		this .data = data;
		next = null;
	}
}
public class Uc2_AddAtFirst {
	
	static Node head;
//addAtFirst
	void addAtFirst(int data) {
		Node newNode = new Node(data); 
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		printList();
	}

//printList
	private void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}System.out.println("");
	}

	public static void main(String[] args) {
		Uc2_AddAtFirst addList = new Uc2_AddAtFirst();

		addList.addAtFirst(70);
		addList.addAtFirst(30);
		addList.addAtFirst(56);
		
	}

}