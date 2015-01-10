/*
 * Lewis Matos
 * Project 2
 * SparseLinkedList
 * Professor Ted Brown
 */
import java.util.Random;

public class Main {
	public final static int ROW = 10;

	public final static int COL = 12;

	public static boolean[][] arr = new boolean[ROW][COL];

	public static int row;

	public static int col;

	public static void main(String[] args) {

		LinkedList list[] = new LinkedList[ROW]; // Linkedlist array
		for (int i = 0; i < list.length; i++) { // Initailize linkedlist
			list[i] = new LinkedList();
		}

		for (char i = 'A'; i <= 'T'; i++) { // Randomly generate row and col and
			// set a character to each node
			char x = i;
			randomGen();
			list[row].insert(new Node(row, col, x));
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				for (Node temp = list[i].getHead(); temp != null; temp = temp
						.getNext()) {
					for (Node temp2 = list[j].getHead(); temp2 != null; temp2 = temp2
							.getNext()) {
						if (temp.getCol() == temp2.getCol()) {
							temp.setDown(temp2);
							break;
						}
					}
				}

			}
		}
		print(list); // Print the nodes

	}

	public static void print(LinkedList list[]) { // Prints the linkedList
		for (int i = 0; i < list.length; i++) {
			System.out.print("index [" + i + "]: ");
			list[i].print();
			System.out.println();
		}
	}

	public static void randomGen() { // Generate Random Row and Column with no
		// duplicates
		row = (new Random()).nextInt(ROW);
		col = (new Random()).nextInt(COL);

		if (arr[row][col] == true) {
			randomGen();
		} else {
			arr[row][col] = true;
			return;
		}
	}

}
