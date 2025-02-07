import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * 의문점 왜 제한범위가 뭘까 버퍼같은경우 결과값을 저장해놓는 배열은 뭐였더라 1. StringTokenizer 클래스를 이용해 문자열 분리
	 * 2. split(0을 이용해 문자열 분리
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 누구세요?
		StringTokenizer st; // 역시나 누구세요? split()이랑 같은 용도이지만 더 많이 씀 
//		String[] input;
		String str;

		while ((str = br.readLine()) != null) { // 입력받는값이 공백일때까지
//			input = br.readLine().split(" ");
//			int a = Integer.parseInt(input[0]);
//			int b = Integer.parseInt(input[1]);
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a + b).append("\n"); // 기존 문자열을 수저하면서 하나씩 값을 추가해줌
		}
		System.out.print(sb);
	}

}
