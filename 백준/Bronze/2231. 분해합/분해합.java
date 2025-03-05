import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 분해합 , 입력받는 숫자를 도출해내는 N = 백자리+십자리+일자리+(출력값) 을 구해야함, 그 출력값(생성자(
		// 가 최솟값임
		/*
		 * 나의 문제점 : 예시가 세자릿수라고 해서 무조건 세자리 수만 고려하려고 함. 문제에 범위는 1<= N <= 1,000,000 라고
		 * 제시되었으므로 6자리수들까지만 고려해주면 됨 N = M + M의 각자리수들의 합 그럼 여기서 M = N - M의 각자리수들의합 인데 M의
		 * 각자리수들의합의 최댓값은 여섯자리수 이내이자 각자리수들이 모두 9 인 경우인데 999,999 이므로 M >= N - 9*6이어야 한다 핵심
		 * : 각 자리 수 합이 가장 클 때를 고려하면, 그보다 작은 숫자는 절대 생성자가 될 수 없다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/*
		 * int M = Integer.MAX_VALUE; for (int i = 0; i <= 9; i++) { // 백의자리 for (int j
		 * = 0; j <= 9; j++) { // 십의자리 for (int k = 0; k <= 9; k++) { // 일의자리 if (N ==
		 * 101 * i + 11 * j + 2 * k) { // ijk + i + j + k 가 N값과 같을 때 int num = 100 * i +
		 * 10 * j + k; // num이라는 변수에 ijk 값 저장 if (M >= num) { // num값이 result값보다 작으면 M =
		 * num; // result값을 num으로 바꿈 } } } } } if (M == Integer.MAX_VALUE) {
		 * System.out.println(0); } else { System.out.println(M); }
		 */
		int M = 0;// 최소 생성자 저장(없으면 0 출력)
		for (int i = Math.max(1, N - 54); i < N; i++) { // Math.max()함수: 두숫자중 더 큰 값을 반환. N-54가 1보다 작을 경우를 제외
			int sum = i, temp = i;
			while (temp > 0) {
				sum += temp % 10; // 나머지를 저장함, 일의자리수부터 걸러냄
				temp /= 10; //한단위 윗 숫자들을 검색하기 위함
			}
			if(sum == N ) {
				M = i;
				break;
			}
		}
		System.out.println(M);
	}
}