import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> factor = new ArrayList<>();
		String[] input = br.readLine().trim().split("\\s+");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				factor.add(i);// 작은수대로 저장 됨
			}
		}
		// 약수의 개수가 K보다 적을 때의 경우를작성해야됨
		if (factor.size() < K) {
			System.out.println(0);
		} else {
			System.out.println(factor.get(K-1));
		}
	}

}
