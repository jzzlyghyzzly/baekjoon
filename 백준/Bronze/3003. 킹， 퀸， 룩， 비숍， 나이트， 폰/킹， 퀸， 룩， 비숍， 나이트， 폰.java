import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int[] chess = { 1, 1, 2, 2, 2, 8 };
		int need[] = new int[chess.length];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < chess.length; i++) {
			int num = Integer.parseInt(input[i]);
			need[i] = chess[i] - num;
		}
		for (int i = 0; i < need.length; i++) {
			System.out.print(need[i] + " ");
		}
	}
}
