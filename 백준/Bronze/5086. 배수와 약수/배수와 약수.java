import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// factor , multiple 등의 값을 저장해줄 배열이 문제
		ArrayList<String> output = new ArrayList<>();
		while (true) {
			String[] input = br.readLine().trim().split("\\s+");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			if (a == b) {
				break;
			}
			if (b % a == 0) {
				output.add("factor");
			} else if (a % b == 0) {
				output.add("multiple");
			} else {
				output.add("neither");
			}
		}
		// key:value 값으로 출력
		for (String result : output) {
			System.out.println(result);
		}
		br.close();
	}
}