

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();

		while (true) {
			String[] input = br.readLine().split(" "); // 한 줄 입력 후 공백기준으로 나누기
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			if (a == 0 && b == 0)
				break;
			list.add(a + b);
		}
		//결과 출력
		for(int result : list) {
			System.out.println(result);
		}
		br.close();
	}

}
