import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int max = 0;
		int th = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 9; i++) {
			String input = br.readLine();
			if (input == null || input.isEmpty())
				break;
			int num = Integer.parseInt(input);
			if (max < num) {
				max = num;
				th = i + 1;
			}
		}
		br.close();
		System.out.println(max);
		System.out.println(th);
	}

}
