import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 소인수분해 알고리즘
		// N의 약수들이 소수로 나타나는 (1과 자기자신을 제외한)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (isPrime(N)) {
			System.out.println(N);
		} else if (!isPrime(N)) {
			for (int i = 2; i <= N; i++) {
				while (N % i == 0) {
					System.out.println(i);
					N /= i;
				}
			}
			if (N == 1) {
				System.out.println();
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}