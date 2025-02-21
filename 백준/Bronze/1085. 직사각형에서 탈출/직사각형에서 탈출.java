import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split("\\s+");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		int h = Integer.parseInt(input[3]);
		int sit[] = { x, y, (w - x), (h - y) };
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i<sit.length; i++) {
			if( sit[i] <= min ) {
				min = sit[i];
			}
		}
		br.close();
		System.out.println(min);
	}

}
