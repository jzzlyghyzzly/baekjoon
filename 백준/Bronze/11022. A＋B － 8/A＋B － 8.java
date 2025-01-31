import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int a[] = new int[T];
		int b[] = new int[T];
		int value[] = new int[T];
		for (int i = 0; i < T; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			a[i] = c;
			b[i] = d;
			value[i] = a[i] + b[i];
		}
		for (int i = 0; i < T; i++) {
			System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + value[i]);
		}

	}

}
