package Day_14_Java_Assignments.StackProblems;

class NodeTwo{
	int data;
	NodeTwo next;
	NodeTwo(int data) {
	this.data = data;
	next = null;
	}
}
public class Uc2_PeekAndPop {

	
	static NodeTwo top;
//addAtFirst
		void addAtFirst(int data) {
			NodeTwo newNode = new NodeTwo(data); 
			if(top == null) {
				top = newNode;
			}else {
				newNode.next = top;
				top = newNode;
			}
			printList();
		}

//printList
		private void printList() {
			NodeTwo temp = top;
			while(temp != null) {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
			}System.out.println("");
		}
	
//pop
		int pop() {
			int number = 0;
			if(top == null) {
				System.out.println("Stack is Empty..");
			}else {
				number = top.data;
				top = top.next;
			}
			printList();
			return number;
		}

//peak
		int peek() {
			int number =0;
			if(top == null) {
				System.out.println("Stack is Empty..");
			}else {
				number = top.data;
			}
			return number;
		}
		
		
	public static void main(String[] args) {
			Uc2_PeekAndPop getList = new Uc2_PeekAndPop();
			
			getList.addAtFirst(70);
			getList.addAtFirst(30);
			getList.addAtFirst(56);
			while(top != null) {
				System.out.println("top :: "+ getList.peek());
			System.out.println("poped ::" + getList.pop());
			System.out.println("");
			}
		}
}