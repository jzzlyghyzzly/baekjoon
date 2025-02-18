import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		// M이상 N이하의 자연수 중 소수인 것을 모두 찾아
		// 첫째줄엔 그 합을
		// 둘째줄에 그 중 최솟값을 출력한다
		int sum = 0;
		int minPrime = Integer.MAX_VALUE; // 소수의 최솟값 초기화
		// 소수는 정수범위의 최댓값보다는 작을 것이기 때문에 점점 작아질 예정
		for (int i = M; i <= N; i++) {
			if (isPrime(i)) {
				sum += i; // 합에 이렇게 더하면 됐었군,,나는 힘들게 배열 만들고 난리를 쳤는데..
				if (i < minPrime) {
					minPrime = i; //i가 정수범위의 최댓값보다 무조건 작을테니 루프돌면서 가장 작은 소수를 저장해줄거임
				}
			}
		}
		// M이상 N이하의 자연수 중 소수가 없을 경우는 첫째줄에 -1을 출력한다.
		if (sum == 0) { // 소수가 없어서 합에 더해진 게 없다는 뜻
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(minPrime); //배열로 안해도되는데,,,루프 쓰면 편한 걸 나는 뒤죽박죽이었다니 한심
		}
		// 고급적이고 간단적인 생각이 들지가 않는다.....

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
/*
 * 지피티의 수정 배열사용이 불필요 소수값대신 boolean 이용 최솟값 추적, Integer.MAX_VALUE
 */
