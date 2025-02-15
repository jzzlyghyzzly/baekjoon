import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] board = new String[5][15];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			String[] line = br.readLine().split("");
			if (line.length > max) {
				max = line.length; // 최대 길이 업데이트
			} // max = Math.max(max, line.length);
			for (int j = 0; j < line.length; j++) {
				board[i][j] = line[j]; // board에 저장
			}
		}

		for (int i = 0; i < max; i++) {// 열
			for (int j = 0; j < 5; j++) { // 행
				if (board[j][i] != null) {
					System.out.print(board[j][i]);
				}
			}
		}
	}
}