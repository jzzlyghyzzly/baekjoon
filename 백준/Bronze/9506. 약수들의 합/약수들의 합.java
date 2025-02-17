import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
//완전수 란 ? 어떤 수가 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라 한다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1) {
				break;
			}
			ArrayList<Integer> factors = new ArrayList<>();
			int sum = 0; // 약수들의 합을 받을 건가봐요

			// 약수 구하기 (1부터 1/2까지) <--왜?? 헉! 약수는 n의 절반 이하의 값에서만 나올 수 있기 때문, 효율성문제
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					factors.add(i);
					sum += i;
				}
			}
			// 완전수 여부 판별
			if (sum == n) {
				System.out.print(n + " = " + factors.get(0));
				for (int i = 1; i < factors.size(); i++) {
					System.out.print(" + " + factors.get(i));
				}
				System.out.println();
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}

	}

}
