import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().trim().split("\\s+");
		int N = Integer.parseInt(input1[0]);
		int M = Integer.parseInt(input1[1]);

		int num[] = new int[N];
		String[] input2 = br.readLine().trim().split("\\s+");
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(input2[i]);
		}
		System.out.println(blackjack(num, N, M));
	}

	static int blackjack(int[] num, int N, int M) {
		int max = 0;
		for (int i = 0; i < N - 2; i++) { // 카드를 3개 골라야하니까 N-2
			for (int j = i + 1; j < N - 1; j++) { // 두번째 카드는 첫번째 카드 다음부터 N-1까지만
				for (int k = j + 1; k < N; k++) { // 세번째 카드는 두번째 카드 다음부터 N까지
					int sum = num[i] + num[j] + num[k];
					if (M == sum) {
						return sum;
					}
					if (max < sum && sum < M) {
						max = sum;
					}
				}
			}
		}
		return max;
	}
}