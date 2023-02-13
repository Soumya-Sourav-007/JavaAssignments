package Day_14_Java_Assignments.LinkedListProblems;

class NodeFour{
	int data;
	NodeFour next;
	NodeFour(int data) {
	this.data = data;
	next = null;
	}
}
public class Uc4_InsertInBetween {

	static NodeFour head;
	static int size = 0;

//addAtLast
		void addAtLast(int data) {
			NodeFour newNode = new NodeFour(data);	
			if(head == null) {
				head = newNode;
			}else {
				NodeFour temp = head;
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
			NodeFour temp = head;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}System.out.println("");
		}

//insert_in_between
		void insertAtChoice(int choice, int data) {
			NodeFour newNode = new NodeFour(data);
			if(choice == 1) {
				head = newNode;
			}else {
				if(head == null) {
				System.out.println("List is Null..Element placed at 1st position ::");	
					head = newNode;
				}else {
					NodeFour temp = head;
					for(int i = 1 ;i < choice-1; i++) {
						temp = temp.next;
					}
					NodeFour res = temp.next;
					temp.next =newNode;
					newNode.next = res;
				}
			}
			printList();
		}

	public static void main(String[] args) {
		Uc4_InsertInBetween listFour = new Uc4_InsertInBetween();

		listFour.addAtLast(56);
		listFour.addAtLast(70);
		
		
		listFour.insertAtChoice(2, 30);

	}

}