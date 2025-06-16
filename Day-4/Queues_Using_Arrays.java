public class Queues_Using_Arrays {
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.print();
		System.out.print(q.deQueue());
		q.print();
	}
}
class Queue {
	int[] arr;
	int size;
	int front;
	int rear;
	Queue(int size) {
		this.size=size;
		this.front=-1;
		this.rear=-1;
		this.arr=new int[size];
	}
	boolean isEmpty() {
		return rear==-1;
	}
	void enQueue(int data) {
		if(isEmpty()) {
			front++;
			rear++;
			arr[front]=data;
		}
		else {
			rear++;
			arr[rear]=data;
		}
	}
	int deQueue() {
		if(isEmpty()) return -1;
		int removedEle=arr[front];
		for (int i =front; i <rear; i++) {
			arr[i] = arr[i + 1];
		}
		rear--;
		return removedEle;
	} void print() {
		for(int i=front; i<=rear; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
	}
	int length() {
		int count=0;
		for(int i=front; i<=rear; i++) {
			count++;
		}
		return count;
	}
}
