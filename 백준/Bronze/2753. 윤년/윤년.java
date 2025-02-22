import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 ==0 && year % 100 !=0 )|| year % 400 == 0 ) { //4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때 (윤년로직)
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}	
}