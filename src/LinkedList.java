/*
 * Lewis Matos
 * Project 2
 * SparseLinkedList
 * Professor Ted Brown
 */

public class LinkedList {

	private Node head;

	public LinkedList(Node n) {
		head = n;

	}

	public LinkedList() {
		Node dummy = new Node();
		head = dummy;
	}

	public boolean is_empty() { // check if list is empty
		boolean empty = true;
		Node current = head;
		if (current.getNext() == null) {
			empty = false;
		}
		;
		return empty;
	}

	public void insert(Node node) {

		Node nNode = node;
		Node current = head;
		if (current.getNext() == null) {
			current.setNext(nNode);
		} else if (current.getNext().getCol() > nNode.getCol()) {
			nNode.setNext(current.getNext());
			current.setNext(nNode);
		} else {
			while (current.getNext() != null
					&& current.getNext().getCol() < nNode.getCol()) {
				current = current.getNext();
			}
			nNode.setNext(current.getNext());
			current.setNext(nNode);
		}
	}

	public void print() {
		Node current = head;
		if (is_empty() != true) {
			System.out.print("List is Empty ");
		} else {
			do {
				System.out.print("( R:" + current.getNext().getRow() + " C:"
						+ current.getNext().getCol() + " Alp:"
						+ current.getNext().getAlpha() + " ID:"
						+ System.identityHashCode(current.getNext())
						+ " Down: "
						+ System.identityHashCode(current.getNext().getDown())
						+ ")" + " --> ");
				current = current.getNext();
			} while (current.getNext() != null);
		}

		System.out.println("NULL");
		System.out.println();
	}


	public Node getHead() {
		return head;
	}
}
