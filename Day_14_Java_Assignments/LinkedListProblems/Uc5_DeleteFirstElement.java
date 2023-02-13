package Day_14_Java_Assignments.LinkedListProblems;

class NodeFive{
	int data;
	NodeFive next;
	NodeFive(int data) {
	this.data = data;
	next = null;
	}
}
public class Uc5_DeleteFirstElement {

	

	static NodeFive head;
	static int size = 0;

//addAtLast
		void addAtLast(int data) {
			NodeFive newNode = new NodeFive(data);	
			if(head == null) {
				head = newNode;
			}else {
				NodeFive temp = head;
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
			NodeFive temp = head;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}System.out.println("");
		}

//insert_in_between
		void insertAtChoice(int choice, int data) {
			NodeFive newNode = new NodeFive(data);
			if(choice == 1) {
				head = newNode;
			}else {
				if(head == null) {
				System.out.println("List is Null..Element placed at 1st position ::");	
					head = newNode;
				}else {
					NodeFive temp = head;
					for(int i = 1 ;i < choice-1; i++) {
						temp = temp.next;
					}
					NodeFive res = temp.next;
					temp.next =newNode;
					newNode.next = res;
				}
			}
			printList();
		}

//deleteFirstElement
		void deleteFirstElement() {
			if(head == null) {
				System.out.println("Empty list..");
			}else {
				NodeFive temp = head;
				head = temp.next;
			}
			printList();
		}
		
		
	public static void main(String[] args) {
		
		Uc5_DeleteFirstElement listFive = new Uc5_DeleteFirstElement();
		
		listFive.addAtLast(56);
		listFive.addAtLast(70);
		listFive.insertAtChoice(2, 30);
		
		listFive.deleteFirstElement();

		
	}

}
