package Day_14_Java_Assignments.LinkedListProblems;

class NodeThree{
	int data;
	NodeThree next;
	NodeThree(int data){
		this .data = data;
		next = null;
	}
}
public class Uc3_AddAtLast {

	static NodeThree head;
	static int size = 0;
	
//addAtLast
	void addAtLast(int data) {
		NodeThree newNode = new NodeThree(data);
	
		if(head == null) {
			head = newNode;
		}else {
			NodeThree temp = head;
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
			NodeThree temp = head;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}System.out.println("");
		}
//Ascending order	
		static<T>void ascendingSort(){
			if(head == null) {
			System.out.println("Empty List...");
			}else {
				for(int i = 1; i <= size; i++) {
					NodeThree temp = head;
					while(temp.next != null) {
						if(temp.data >= temp.next.data) {
							int res = temp.data;
							temp.data = temp.next.data;
							temp.next.data = res;
						}temp = temp.next;
					}
				}
				printList();
			}
			
		}
	
//descending order
		static<T>void descendingSort(){
			if(head == null) {
				System.out.println(" Empty List...");
			}else {
				for(int i = 0;i < size; i++) {
					NodeThree temp = head;
					while(temp.next !=null) {
						if(temp.data <= temp.next.data) {
							int res = temp.data;
							temp.data = temp.next.data;
							temp.next.data = res;
						}temp = temp.next;
					}
				}
				printList();
			}
		}
		
	public static void main(String[] args) {
		Uc3_AddAtLast listThree = new Uc3_AddAtLast();

		listThree.addAtLast(56);
		listThree.addAtLast(30);
		listThree.addAtLast(70);
		
//		//testing_purpose
//		listThree.addAtLast(14);
//		listThree.addAtLast(21);
//		
//		System.out.println("Ascending ::");
//		ascendingSort();
//		System.out.println("Descending ::");
//		descendingSort();
		
	}

}