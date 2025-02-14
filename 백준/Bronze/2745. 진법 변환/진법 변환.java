import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		sc.close();
		System.out.println(Integer.parseInt(N, B));
	}

}
