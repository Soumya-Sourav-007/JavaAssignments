package Day_14_Java_Assignments.StackProblems;

class NodeThree{
	int data;
	NodeThree next;
	NodeThree(int data) {
	this.data = data;
	next = null;
	}
}
public class Uc3_QueueEnqueue {
	
	static NodeThree front;
	static int size = 0;
	
//enqueue
	void enqueue(int data) {
		NodeThree newNode = new NodeThree(data);
	
		if(front == null) {
			front = newNode;
		}else {
			NodeThree temp = front;
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
			NodeThree temp = front;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}System.out.println("");
		}


	public static void main(String[] args) {
		Uc3_QueueEnqueue queueThree = new Uc3_QueueEnqueue();

		queueThree.enqueue(56);
		queueThree.enqueue(30);
		queueThree.enqueue(70);
		
	}
}