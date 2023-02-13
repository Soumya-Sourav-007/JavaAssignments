package Day_14_Java_Assignments.LinkedListProblems;

class NodeSix{
	int data;
	NodeSix next;
	NodeSix(int data) {
	this.data = data;
	next = null;
	}
}
public class Uc6_DeleteLastElement {


	static NodeSix head;
	static int size = 0;

//addAtLast
		void addAtLast(int data) {
			NodeSix newNode = new NodeSix(data);	
			if(head == null) {
				head = newNode;
			}else {
				NodeSix temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			size++;
			printList();
		}
		
//printList
		private void printList() {
			NodeSix temp = head;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}System.out.println("");
		}

//insert_in_between
		void insertAtChoice(int choice, int data) {
			NodeSix newNode = new NodeSix(data);
			if(choice == 1) {
				head = newNode;
			}else {
				if(head == null) {
				System.out.println("List is Null..Element placed at 1st position ::");	
					head = newNode;
				}else {
					NodeSix temp = head;
					for(int i = 1 ;i < choice-1; i++) {
						temp = temp.next;
					}
					NodeSix res = temp.next;
					temp.next =newNode;
					newNode.next = res;
				}
			}
			printList();
		}
		
//delete_at_last
		void popLast() {
			if(head == null) {
				System.out.println("Empty List....");
			}else {
				NodeSix temp = head;
				while(temp.next.next != null) {
					temp = temp.next;
				}
				temp.next = null;
			}
			printList();
		}
		
		
	public static void main(String[] args) {
		
		Uc6_DeleteLastElement listSix = new Uc6_DeleteLastElement();
		
		listSix.addAtLast(56);
		listSix.addAtLast(70);
		listSix.insertAtChoice(2, 30);
		
		listSix.popLast();


	}

}
