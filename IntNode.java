
public class IntNode {

	private int data;
	private IntNode link;

	// default constructor
	public IntNode() {

		data = 0;
		link = null;

	}

	// constructor with arguments
	public IntNode(int d, IntNode n) {

		data = d;

		link = n;

	}

	public int getValue() {

		return data;

	}

	public IntNode getLink() {

		return link;

	}

	public void setValue(int v) {

		data = v;

	}

	public void setLink(IntNode l) {

		link = l;

	}

	/*
	 * returns the length of the given list
	 * 
	 * @param head
	 * 
	 * node for the beginning of list
	 * 
	 * @return
	 * 
	 * length - actual length of the list
	 * 
	 */
	public static int listLength(IntNode head) {

		IntNode point;

		int length = 0;

		for (point = head; point != null; point = point.link)

			length++;

		return length;

	}

	/*
	 * searches for the given value 'data' in the list starting at node 'head'
	 * 
	 * @param head, data
	 * 
	 * head- node at the beginning of linked list data- value to be searched in the
	 * list
	 * 
	 * @ return
	 * 
	 * true or false whether or not data is found in list
	 * 
	 */
	public static boolean searcher(IntNode head, int data) {

		if (head == null)

			return false;

		IntNode pointer;

		for (pointer = head; pointer != null; pointer = pointer.link)

			if (data == pointer.data)

				return true;

		return false;

	}

	/*
	 * adds value after the given node position
	 * 
	 * @param newPoint data to be added to the list
	 */
	public void addNodeAfter(int newpoint) {

		link = new IntNode(newpoint, link);

	}

	/*
	 * removes node after the given position in the linked list
	 * 
	 * @postcondition the item after the given node is removed
	 * 
	 */
	public void removeNodeAfter() {

		link = link.link;

	}
	
	/*
	 * lists the amount of even numbers in the list
	 * 
	 * @param - head: node at the beginning of the list
	 * 
	 *  @precondition 
	 *  
	 *  if head null, then return zero
	 *  
	 *  @return
	 *  
	 *  count: number of evens
	 * 
	 * 
	 */
	
	public static int listEvenNumber(IntNode head) {

		if (head == null)

			return 0;

		int count = 0;

		for (IntNode cursor = head; cursor != null; cursor.link = cursor.link)

			if (cursor.data % 2 == 0)

				count++;

		return count;

	}
	
	
	/*
	 * adds new value to end of list
	 * 
	 * @param: newpoint - integer to be added to list
	 * 
	 * 
	 * @precondition
	 * 
	 * if link is null, then link = newpoint and ull
	 *  
	 *  
	 *  @postcondition
	 *  
	 *  newpoint is added to list
	 * 
	 */

	public void addToEnd(int newpoint) {

		if (link == null)

			link = new IntNode(newpoint, null);

		else

			link.addToEnd(newpoint);

	}

	/*
	 * returns the sum of the numbers from the end of the list up to the set limit
	 * 
	 *  @param: head and limit
	 *  
	 *  node at beginning of list, and number of values in list to be added up 
	 *  
	 *  @return - sum
	 *  
	 *  the sum of elements added
	 * 
	 */
	
	public static int sumLast(IntNode head, int limit) {

		int sum = 0;
		int count = 0;
		int length = listLength(head);

		IntNode cursor = head;

		while (cursor != null) {

			count++;

			if (count > length - limit) {

				sum = sum + cursor.data;
			}

			cursor = cursor.link;

		}

		return sum;

	}

	
	/*
	 * copies the odd values from the list and returns a new IntNode with only those odd numbers
	 * 
	 * @param - head
	 * 
	 * 
	 * @precondition - if head is null, return null
	 * 
	 * @return 
	 * 
	 * oddNodes - node with the odd values from list
	 * 
	 */
	public static IntNode copyOdd(IntNode head) {

		if (head == null)

			return null;

		IntNode oddNodes = new IntNode();

		IntNode cursor;

		for (cursor = head; cursor != null; cursor = cursor.link)

			if (cursor.data % 2 != 0)

				oddNodes.addNodeAfter(cursor.data);

		return oddNodes;

	}

	
	/*  
	 * removes any instance of the value "value" from the list
	 * 
	 * @param 
	 * 
	 * head, value 
	 * 
	 * 
	 * @precondition
	 * 
	 * if head is null, return null
	 * 
	 * @postcondition
	 * 
	 * if the head value is the value selected for removal, remove the head value
	 * 
	 * @return 
	 * 
	 * head after given value is removed from list
	 * 
	 */
	public static IntNode removeAll(IntNode head, int value) {

		if (head == null)

			return null;

		IntNode dummy = head;

		while (dummy.link != null) {

			if (dummy.link.data == value) {

				dummy.link = dummy.link.link;

			}

			else {
				dummy = dummy.link;
			}

		}

		return head.data == value ? head.link : head;

	}
	
	/*
	 * reverses the linked list 
	 * 
	 * @param 
	 * 
	 * head
	 * 
	 * @precondition
	 * 
	 * if head is null, return null
	 * 
	 * @return
	 * 
	 * linked list at head value
	 * 
	 */

	public static IntNode reverse(IntNode head) {

		IntNode first = null;

		IntNode last = null;

		IntNode reverse = head;

		if (head == null)

			return null;

		while (reverse != null) {

			first = reverse.link;

			reverse.link = last;

			last = reverse;

			reverse = first;

		}

		head = last;

		return head;

	}
	
	/*
	 * checks if the given linked list is cyclic or acyclic 
	 * 
	 * @param 
	 * head
	 * 
	 * @return 
	 * 
	 * true or false
	 * 
	 */
	
	public static boolean hasCycle(IntNode head) {

		IntNode cursor = head.link;

		while (cursor != null && cursor != head)

			cursor = cursor.link;

		return (cursor == head);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 * 
	 * overrides String method to print linkedList in given format
	 * 
	 * @return result- formatted string value
	 * 
	 */
	public String toString() {

		String result = "";

		for (IntNode cursor = this; cursor != null; cursor = cursor.link) {

			if (result == "") {
				result = Integer.toString(cursor.getValue());
			} else
				result += " -> " + cursor.getValue();
		}

		return result;

	}

}
