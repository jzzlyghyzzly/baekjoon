import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 중앙 이동 알고리즘
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 진짜 모르겟다 -> 규칙만 찾으면 됨
		// 점의 개수 == (한 변의 점 개수)^2
		// 0단계에서의 점의 개수 2^2 (dot =2)
		// 1단계에서의 점의 개수 3^2 (dot+1)
		// 2단계에서의 점의 개수 5^2 (dot+1+2)
		// 3단계에서의 점의 개수 9^2 (dot+1+2+4)
		//1 3 5 9 17 33 65  (2 , 4, 8, 16, 32) 
		// 한변의 점의 개수 = p;
		// n단계 점의 개수 ==
		int dot = 2;
		if (N == 0) {
			System.out.println((int) Math.pow(dot, 2));
		} else {
			for(int i =0 ; i< N ; i++) {
				dot = dot + (dot-1)  ;
				/* System.out.println(dot); */
			}
		}System.out.println((int)Math.pow(dot, 2));

		br.close();
	}
}
