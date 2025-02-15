import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int black = 0; // 검은 영역의 넓이
		int n = Integer.parseInt(br.readLine()); // 색종이 개수
		/*
		 * 가로 세로 크기가 100인 도화지가 하나 위에 가로세로 각각10인 색종이 N개를 겹쳐 붙임. boolean형 배열[101][101]인 배열
		 * paper 선언 만약 어떤수 x,y에 대해 paper [x][y]가 true라면 색종이가 붙어져 있다는 뜻임
		 */
		boolean[][] paper = new boolean[101][101]; // 도화지
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().trim().split("\\s+");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			// (x,y) 부터 (x+9,y+9) 까지의 영역을 하나씩 체크한 후 총 넓이에 더한다.
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!paper[j][k]) {
						paper[j][k] = true;
						black++;
					}
				}
			}
		}
		System.out.println(black);
		br.close();
	}

}
