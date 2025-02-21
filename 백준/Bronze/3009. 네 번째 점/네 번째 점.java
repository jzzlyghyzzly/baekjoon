import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x[] = new int[3];
		int y[] = new int[3];
		int dotx = x[0], doty = y[0];
		for (int i = 0; i < 3; i++) {
			String[] input = br.readLine().trim().split("\\s+");
			x[i] = Integer.parseInt(input[0]);
			y[i] = Integer.parseInt(input[1]);
		}
		if(x[0] == x[1]) {
			dotx = x[2];
		} else if(x[0] == x[2]) {
			dotx = x[1];
		}else if(x[1] == x[2]) {
			dotx = x[0];
		}
		if(y[0] == y[1]) {
			doty = y[2];
		} else if(y[0] == y[2]) {
			doty = y[1];
		}else if(y[1] == y[2]) {
			doty = y[0];
		}
		System.out.println(dotx + " " + doty);
	}

}
