import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int[] num = {a,b,c};
		int max= 0;
		//세 수가 모두 동일할 경우
		if(a==b && a==c) {
			System.out.println(10000+a*1000);
		} 
		//두 수만 동일한 경우
		if(a==b && a!=c) { //c만 다른 경우
			System.out.println(1000+a*100);
		} else if(a!=b && b==c) {//a만 다른 경우
			System.out.println(1000+b*100);
		} else if(a==c && b!=c) {//b만 다른 경우
			System.out.println(1000+c*100);
		} 
		//세 수가 모두 다른 경우
		//세 수의 대수비교
		if(a!=b && b!=c && a!=c) {
		for(int i=0; i<3; i++) {
			if(num[i] > max) {
				max=num[i];
			}
		}
		System.out.println(max*100);
		}
	}

}
