import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[N];
		int value[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (X > A[i]) {
				value[i] = A[i];
			}
		}
		for (int i = 0; i < N; i++) {
			if (value[i] != 0) {
				System.out.print(value[i]+" ");
			}
		}
	}

}
