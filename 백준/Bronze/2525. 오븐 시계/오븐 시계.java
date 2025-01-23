import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int time = a * 60 + b + c;
		/*
		 * if (time > 24 * 60) { time = time - 24 * 60; }
		 */
		System.out.print((time / 60)%24 + " ");
		System.out.println(time % 60);
	}

}
