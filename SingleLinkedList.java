package singlelinklist;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;

	}

}

class LinkedList {
	Node head;

	void printLinkList() {
		Node curr = this.head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	void add(int e) {
		Node temp = new Node(e);

		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}

	}

	void addfirst(int e) {

		Node temp = new Node(e);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	void add(int index, int element) throws IndexOutOfBoundsException {
		try {
			if (index == 0) {
				addfirst(element);
			} else {
				Node temp = new Node(element);
				int count = 0;
				Node curr = this.head;
				while (count < index - 1) {
					curr = curr.next;
					count++;
				}
				temp.next = curr.next;
				curr.next = temp;
			}

		} catch (NullPointerException e) {
			throw new IndexOutOfBoundsException();
		}
	}

	void addAll(int[] elements) {
		for (int element : elements) {
			add(element);
		}
	}

	void removeFirst() {
		if (head == null) {

		} else if (head.next == null) {
			head = null;
		} else if (head.next != null) {
			Node curr = head;
			head = head.next;
			curr.next = null;
		}
	}

	void removeLast() {
		if (head == null) {

		} else if (head.next == null) {
			head = null;
		} else if (head.next != null) {
			Node curr = head;
			while (curr.next.next != null) {
				curr = curr.next;
			}
			curr.next = null;
		}
	}

	int indexOf(int element) {
		Node curr = head;
		int count = 0;
		while (curr != null) {
			if (curr.data == element) {
				return count;
			}
			curr = curr.next;
			count++;
		}
		return -1;
	}

	int lastIndexOf(int element) {
		Node curr = head;
		int count = 0;
		int index = -1;
		while (curr != null) {
			if (curr.data == element) {
				index = count;
			}
			curr = curr.next;
			count++;
		}
		return index;

	}

	int size() {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			curr = curr.next;
			count++;
		}
		return count;
	}
}

public class SingleLinkedList {

	private Node head;

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);// 0
		ll.add(30);// 1
		ll.add(30);// 2
		ll.add(40);// 3
//		ll.addfirst(50);

//		ll.add(3, 25);
//		ll.add(10, 50);
//		int ar[]= {1,2,3,4};
//		ll.addAll(ar);
//		ll.removeFirst();
//		ll.removeFirst();

//		ll.printLinkList();
//		ll.removeLast();

		ll.printLinkList();
//		System.out.println(ll.lastIndexOf(300));
//		System.out.println(ll.indexOf(30));
		System.out.println(ll.size());
	}

}
