import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int max = Math.max(a, Math.max(b, c));
		int sum = a + b + c - max;
		if (sum > max) { // 가장 긴변의 길이가 나머지 두변의길이보다 작을때 -> 삼각형조건달성
			System.out.println(a + b + c);
		} else {
			System.out.println(sum * 2 - 1);
		}
	}
}