/*
 * Lewis Matos
 * Project 2
 * SparseLinkedList
 * Professor Ted Brown
 */
public class Node {

	private char alpha;
	private int row;
	private int col;
	private Node down;
	private Node next;

	public Node() {
		alpha = 'X';
		row = 0;
		col = 0;
		down = null;
		next = null;

	}

	public Node(int r, int c, char alpha) {
		this.alpha = alpha;
		row = r;
		col = c;
		down = null;
		next = null;
	}

	public char getAlpha() {
		return alpha;
	}

	public Node getNext() {
		return next;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node d) {
		down = d;
	}

	public void setNext(Node n) {
		next = n;
	}

	public int getRow() {
		return row;

	}

	public int getCol() {
		return col;
	}

}
