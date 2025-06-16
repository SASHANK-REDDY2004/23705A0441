public class Linked_list1 {
	public static void main (String[] args) {
		LinkedList list=new LinkedList();
		list.insertBeg(10);
		list.insertBeg(20);
		list.insertBeg(30);
		list.insertBeg(40);
		list.deletePos(1);
		list.print();
	}

}
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class LinkedList {
	Node head;
	LinkedList() {
		this.head=null;
	}
	void insertBeg(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	void insertEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp != null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	void insertPos(int data,int pos) {
		Node newNode=new Node(data);
		int length_=0;
		Node temp=head;
		while(temp!= null) {
			length_=length_+1;
			temp=temp.next;
		}
		if(pos>=0 && pos<=length_) {
			if(pos==0) insertBeg(data);
			else if(pos==length_) insertEnd(data);
			else {
				for(int i=1; i<pos; i++) {
					temp=temp.next;
				}
				newNode.next=temp.next;
				temp.next=newNode;
			}
		}
		else {
			System.out.println("The position is invalid");
		}
	}
	Node getHead() {
		return head;
	}
	int length() {
		int length_=0;
		Node temp=head;
		while(temp!=null) {
			length_=length_+1;
		}
		return length_;
	}
	void print() {
		Node temp=head;
		System.out.print("Elements in the Linkedlist are:");
		while(temp!=null) {
			System.out.print(temp.data+"--> ");
			temp=temp.next;
		}
		System.out.print("Null\n");
	}
	int deleteBeg() {
		if(head==null) {
			System.out.println("There are no elements in list");
			return -1;
		}
		int removeEle=head.data;
		head=head.next;
		return removeEle;
	}
	int deleteEnd() {
		Node temp=head;
		if(length()==0) {
			System.out.println("No elements in array");
			return 0;
		}
		else if(length()==1) {
			int removeEle=head.data;
			return removeEle;
		}
		else {
			for(int i=1; i<length()-1; i++) {
				temp=temp.next;
			}
			int removeEle=temp.data;
			temp.next=null;
			return removeEle;
		}
	}
	int deletePos(int pos) {
		Node temp=head;
		int removedEle;
		if(pos>=0 && pos<=length()) {
			if(pos==1) {
				deleteBeg();
				return head.next.data;
			}
			else if(pos==length()) {
				deleteEnd();
				return 1;
			}
			else {
				for(int i=0; i<pos; i++) {
					temp=temp.next;
				}
				removedEle=temp.next.data;
				temp.next=temp.next.next;
				return removedEle;
			}
		}
		else {
			System.out.println("Invalid location");
			return 0;
		}
	}
}
static LinkedList ArrayToList(int[] arr) {
		LinkedList list=new LinkedList();
		for(int i=0; i<arr.length; i++) {
			list.insertEnd(arr[i]);
		}
		return list;
}
int[] listToArray() {
		int[] arr=new int[length()];
		Node temp=head;
		for(int i=0; i<arr.length; i++) {
			arr[i]=temp.data;
			temp=temp.next;
		}
		return arr;
}
private int length() {
	throw new UnsupportedOperationException("Unimplemented method 'length'");
}

	
