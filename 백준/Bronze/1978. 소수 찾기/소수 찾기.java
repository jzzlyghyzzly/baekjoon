import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().trim().split("\\s+");
		int countPrimes = 0;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(input[i]);
			if (isPrime(num)) {
				countPrimes++; // 소수면 카운트증가
			}
		}
		System.out.println(countPrimes);
		br.close();
	}

	private static boolean isPrime(int n) {
		// 소수의 정의 : 1아님 , 1과 자기자신, 자기자신의 반수로밖에 나누어떨어지지 않는 1 이외의 정수, 
		// 즉 양의 정수가 2개인 자연수를 의미함
		if (n <= 1)
			return false;
        if (n == 2) //하지만 2는 소수임
			return true;
		if (n % 2 == 0) //짝수는 소수가 될 수 없음 2를 무조건 약수를 가지기 때문임
			return false;
		
		for (int i = 3; i * i <= n; i += 2) { // 이해 종나 안됨 
			//i가 n의 제곱근보다 작거나 같을때까지, n은 홀수만 
			if (n % i == 0)
				return false;
		}
		return true;
	}
}