import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = 0, B = 0, C = 0;
		while (true) {
			String[] input = br.readLine().trim().split("\\s+");
			A = Integer.parseInt(input[0]);
			B = Integer.parseInt(input[1]);
			C = Integer.parseInt(input[2]);
			int max = Integer.MIN_VALUE;
			int leng[] = { A, B, C };
			for (int i = 0; i < 3; i++) {
				if (leng[i] > max) {
					max = leng[i];
				}
			}
			if (A == 0) {
				break;
			}
			if (max >= (A + B + C - max)) {
				System.out.println("Invalid");
			} else {
				if (A == B && A == C) {
					System.out.println("Equilateral");
				} else if (A == B || B == C || A == C) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			}
		}
	}

}
