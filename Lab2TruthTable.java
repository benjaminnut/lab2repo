
public class Lab2TruthTable {
	// ~S -> R
	public static boolean condition1(int s, int r) {

		if (s == 0 && r == 0)

			return false;

		else

			return true;

	}

	// W \/ ~R
	public static boolean condition2(int w, int r) {

		if (w == 1 || r == 0)

			return true;

		else
			return false;

	}

	// M -> ~G
	public static boolean condition3(int m, int g) {

		if (m == 1 && g == 1)

			return false;

		else

			return true;

	}

	// G <-> S
	public static boolean condition4(int g, int s) {

		if (g == s)
			return true;

		else
			return false;

	}

	//
	public static boolean condition5Point1(int w, int s) {

		if (w == 1 && s == 0)

			return false;

		else

			return true;

	}

	// W ->( S /\ M)
	public static boolean condition5(int w, int s, int m) {

		if (w == 0)

			return true;

		else

			return condition5Point2(s, m);

	}

	// S /\ M
	public static boolean condition5Point2(int s, int m) {

		if (s == 1 && m == 1)

			return true;

		else
			return false;

	}

	// S -> W
	public static boolean condition6(int s, int w) {

		if (s == 1 && w == 0)

			return false;

		else
			return true;
	}

	public static void main(String[] args) {

		// System.out.println("(~S ->R) /\\(W\\/ ~ R) /\\ (M -> ~ G) /\\ (G <-> S) /\\
		// (W -> S /\\ M) /\\ (S -> W)");

		for (int g = 0; g <= 1; g++)
			for (int m = 0; m <= 1; m++)
				for (int r = 0; r <= 1; r++)
					for (int s = 0; s <= 1; s++)
						for (int w = 0; w <= 1; w++) {

							// (~S - > R)

							if (s == 0)
								System.out.print(1 + " ");

							else
								System.out.print(0 + " ");

							System.out.print(s + " ");

							if (condition1(s, r))

								System.out.print(1 + " ");

							else

								System.out.print(0 + " ");

							System.out.print(r + "  ");

							// (~S -> R) /\ (W \/ ~R)

							if (condition1(s, r) && condition2(w, r))

								System.out.print(1 + "  ");

							else
								System.out.print(0 + "  ");

							// (W \/ ~ R)

							System.out.print(w + " ");

							if (condition2(w, r))
								System.out.print(1 + " ");

							else
								System.out.print(0 + " ");

							if (r == 1)

								System.out.print(0 + " ");

							else
								System.out.print(1 + " ");

							System.out.print(r + "  ");

							if (condition1(s, r) && condition2(w, r) && condition3(m, g))
								System.out.print(1 + "  ");

							else
								System.out.print(0 + "  ");

							System.out.print(m + " ");

							if (condition3(m, g))

								System.out.print(1 + " ");

							else

								System.out.print(0 + " ");

							if (g == 0)

								System.out.print(1 + " ");

							else
								System.out.print(0 + " ");

							System.out.print(g + "  ");

							if (condition1(s, r) && condition2(w, r) && condition3(m, g) && condition4(g, s))

								System.out.print(1 + "  ");

							else
								System.out.print(0 + "  ");

							System.out.print(g + " ");

							if (condition4(g, s))

								System.out.print(1 + " ");

							else
								System.out.print(0 + " ");

							System.out.print(s + "  ");

							if (condition1(s, r) && condition2(w, r) && condition3(m, g) && condition4(g, s)
									&& condition5(w, s, m))

								System.out.print(1 + "  ");

							else
								System.out.print(0 + "  ");

							System.out.print(w + " ");

							if (condition5Point1(w, s))

								System.out.print(1 + " ");
							else
								System.out.print(0 + " ");

							System.out.print(s + " ");

							if (condition5Point2(s, m))

								System.out.print(1 + " ");

							else
								System.out.print(0 + " ");

							System.out.print(m + "  ");

							if (condition1(s, r) && condition2(w, r) && condition3(m, g) && condition4(g, s)
									&& condition5(w, s, m) && condition6(s, w))

								System.out.print(1 + "  ");

							else
								System.out.print(0 + "  ");
							
							System.out.print(s + " ");

							if (condition6(s, w))

								System.out.print(1 + " ");
							else
								System.out.print(0 + " ");
							
							System.out.print(w + " ");

							System.out.println();

						}

	}

}
