package Day_14_Java_Assignments.StackProblems;

class NodeFour{
	int data;
	NodeFour next;
	NodeFour(int data) {
	this.data = data;
	next = null;
	}
}
public class Uc4_Dequeue {

	static NodeFour front;
	static int size = 0;
	
//enqueue
	void enqueue(int data) {
		NodeFour newNode = new NodeFour(data);
	
		if(front == null) {
			front = newNode;
		}else {
			NodeFour temp = front;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
		printList();
	}
	
//printList
		static void printList() {
			NodeFour temp = front;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}System.out.println("");
		}

//dequeue
		int dequeue() {
			int number =0;
			if(front == null) {
				System.out.println("Empty Queue");
			}else {
				number =front.data;
				front = front.next;
			}
			printList();
			return number;
		}
		
		
	public static void main(String[] args) {
		Uc4_Dequeue queueFour = new Uc4_Dequeue();
		
		queueFour.enqueue(56);
		queueFour.enqueue(30);
		queueFour.enqueue(70);
		System.out.println("Dequeue :: "+queueFour.dequeue());
		

	}

}