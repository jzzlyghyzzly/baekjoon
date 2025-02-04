import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int value[] = new int[N];
		for (int i = 0; i < N; i++) {
			value[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (v == value[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
