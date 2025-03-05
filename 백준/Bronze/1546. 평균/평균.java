import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 시험 본 과목의 개수
		float score[] = new float[N];
		float max = 0, mean = 0;
		String[] input = br.readLine().trim().split("\\s+");
		for (int i = 0; i < N; i++) {
			score[i] = Float.parseFloat(input[i]);
			if (max < score[i]) {
				max = score[i];
			}
		}
		for (int i = 0; i < N; i++) {
			score[i] = score[i] / max * 100;
			mean += score[i];
		}
		System.out.println(mean / (float) N);
	}

}
