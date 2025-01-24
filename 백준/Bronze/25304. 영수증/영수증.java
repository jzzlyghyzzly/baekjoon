import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();// 가격
		int Y = sc.nextInt(); // 물건 구입 종류
		int price = 0; // 더할 값을 담아놓을 변수
		for (int i = 0; i < Y; i++) {
			int pri = sc.nextInt(); // 물건 가격
			int acc = sc.nextInt(); // 구매 개수
			price += pri * acc;
		}
		if(X == price ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
