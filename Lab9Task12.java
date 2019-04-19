
public class Lab9Task12 {

	public static int f(int n) {

		if (n == 1)
			return 0;

		if (n == 2)
			return 0;

		if (n == 3)
			return 1;

		if (n == 4)
			return 3;

		return 2 * f(n - 1) + 2 ^ n - 4 - f(n - 4);

	}

	public static int g(int n) {

		if (n == 0)
			return 0;

		if (n == 1)
			return 0;

		if (n == 2)
			return 1;

		return g(n - 1) + g(n - 2) + g(n - 3) + 2 ^ (n - 3);

	}

	public static boolean Task12() {

		for (int x = 0; x <= 1000; x++) {

			if (f(x) != g(x))

				return false;

		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(f(16));

		System.out.println(g(16));

		System.out.println(Task12());

	}

}
