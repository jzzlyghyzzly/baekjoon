import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[9][9];
        int num = Integer.MIN_VALUE;  // 최소값으로 초기화
        int n = 0, m = 0;
        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().trim().split("\\s+");  // 공백 여러 개 대비
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(input[j]);
                if (board[i][j] > num) {
                    num = board[i][j];
                    n = i + 1;
                    m = j + 1;
                }
            }
        }
        br.close();
        System.out.println(num);
        System.out.println(n + " " + m);
    }
}