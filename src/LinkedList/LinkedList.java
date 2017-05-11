package LinkedList;

public class LinkedList {
	Node head, tail;
	int size;
	
	public void inisialisasi() {
		head=tail=null;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(Object o) {
		Node input = new Node();
		input.data = o;
		if(isEmpty()) {
			head=input;
			tail=input;
		}
		else {
			input.next=head;
			head=input;
		}
		size++;
	}
	
	public void addLast(Object o) {
		Node input = new Node();
		input.data = o ;
		if (isEmpty()) {
			head=input;
			tail=input;
		}
		else {
			tail.next=input;
			tail=tail.next;
		}
		size++;
	}
	
	public void print() {
		Node temp = head;
		if(!isEmpty()) {
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		else {
			System.out.println("Data kosong");
		}
	}
}
