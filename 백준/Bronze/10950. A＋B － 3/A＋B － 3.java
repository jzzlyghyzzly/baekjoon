import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] num = new int[i];
		for (int a = 0; a < i; a++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			num[a] = x + y;
		}
		for (int b = 0; b < i; b++) {
			System.out.println(num[b]);
		}

	}

}
