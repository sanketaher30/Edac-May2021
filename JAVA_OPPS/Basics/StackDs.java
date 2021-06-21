public class StackDs {
	int top;
	int arr[];
	int Cap;
	
	public StackArry(int size) {
		top=-1;
		arr=new int[size];
		Cap=size;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==Cap-1;
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
			System.exit(0);
		}
		System.out.println(data);
		arr[++top]=data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(0);
		}
		System.out.println(arr[top]);
		return arr[top--];
		public static void main (String args[]) {
			StackDs sds = new  StackDs(4);
			sds.push(10);
			sds.push(20);
			sds.push(30);
			System.out.println("pop the data");
			sds.pop();
			sds.pop();
		}
	}
}