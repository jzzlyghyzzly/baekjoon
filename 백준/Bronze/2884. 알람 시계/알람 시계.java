import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		int time = H*60 + M;
		int alarm = time - 45;
		if( alarm < 0) {
			alarm = alarm + 24*60;
		}
		System.out.print(alarm/60 + " ");
		System.out.print(alarm%60);
	}

}
