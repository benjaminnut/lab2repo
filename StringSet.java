import java.util.*;

public class StringSet implements Cloneable {

	private String[] authors;
	private int capacity;

	public StringSet() {

		// StringSet SS = new StringSet();

		capacity = 2;

		authors = new String[2];

	}

	public StringSet(int _capacity) {

		// StringSet SS = new StringSet();

		capacity = _capacity;

		authors = new String[_capacity];

	}

	public StringSet(StringSet SS2) {

		if (SS2 == null)
			return;
		if (SS2 instanceof StringSet) {

			StringSet SS = (StringSet) SS2;

			capacity = SS.capacity;
			authors = SS.authors;
		} else {

			return;

		}

	}

	public int size() {

		int size = 0;

		for (int x = 0; x < authors.length; x++) {

			if (authors[x] != null)
				size++;

		}

		return size;

	}

	public int capacity() {

		return capacity;

	}

	public void add(String a) {

		int check = 0;

		if (a == null)
			return;

		for (int i = 0; i < capacity; i++)

			if (authors[i] != null)

				check++;

		if (check == capacity)

			ensureCapacity(check);

		for (int x = 0; x < authors.length; x++) {

			if (authors[x] == null) {

				authors[x] = a;

				break;

			}

		}

	}

	public boolean contains(String a) {

		if (a == null)
			return false;

		for (int x = 0; x < authors.length; x++)

			if (authors[x] == a)
				return true;

		return false;

	}

	public boolean remove(String a) {

		if (a == null)
			return true;

		for (int x = 0; x < authors.length; x++)

			if (authors[x] == a)

				authors[x] = "";

		return false;

	}

	public void ensureCapacity(int minCap) {

		String[] moreAuthors;

		if (minCap <= 0)
			return;

		if (minCap <= capacity) {

			minCap = capacity * 2;

			moreAuthors = Arrays.copyOf(authors, minCap);

			capacity = minCap;

			authors = Arrays.copyOf(moreAuthors, capacity);

		}

		else
			return;

	}

	public void addOrdered(String a) {

		int check = 0;

		if (a == null)
			return;

		int i = 0, j = 0;
		String compare = null;

		for (j = 1; j < authors.length; j++) {

			compare = authors[j];
			i = j - 1;

			while (i >= 0) {

				if (compare.compareTo(authors[i]) > 0)
					break;
			}

			authors[i + 1] = authors[i];

			i--;

		}

		authors[i + 1] = compare;
		

		for (int k = 0; k < capacity; k++)

			if (authors[k] != null)

				check++;

		if (check == capacity)

			ensureCapacity(check);

		for (int x = 0; x < authors.length; x++) {

			if (authors[x] == null) {

				authors[x] = a;

				break;

			}

		}

	}

	public String toString() {

		String result = "";

		for (int x = 0; x < authors.length; x++)

			if (authors[x] != null)

				result = result + authors[x] + " ";

		return result + " Capacity: " + Integer.toString(capacity);

	}

	public static void main(String[] args) {

		StringSet moreStrings = new StringSet();

		moreStrings.add("Johnny");

		System.out.println(moreStrings.toString());

		moreStrings.add("Terry");

		System.out.println(moreStrings.toString());

		moreStrings.add("Will");

		// moreStrings.ensureCapacity(moreStrings.capacity);

		// System.out.println(moreStrings.capacity());

		System.out.println(moreStrings.toString());

		moreStrings.add("Harold");

		System.out.println(moreStrings.toString());

		moreStrings.addOrdered("Aaron");

		System.out.println(moreStrings.toString());

	}

}
