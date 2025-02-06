import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String word[] = new String[T];
		for (int i = 0; i < T; i++) {
			word[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < T; i++) {
			System.out.println(word[i].charAt(0) + "" + word[i].charAt(word[i].length() - 1)); // ""가 없으면 ASCII코드라 산수를
																								// 진행해버림 주의
		}
	}
}
