
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[N];
		int min, max;
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		// 비교하기
		min = num[0];
		max = num[0];
		for (int i = 1; i < N; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(min + " " + max);

	}

}
