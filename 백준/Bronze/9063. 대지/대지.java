import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int x[] = new int[N];
		int y[] = new int[N];
		int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE, maxx = Integer.MIN_VALUE, maxy = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().trim().split("\\s+");
			x[i] = Integer.parseInt(input[0]);
			y[i] = Integer.parseInt(input[1]);
			if (x[i] < minx) {
				minx = x[i];
			}
			if (y[i] < miny) {
				miny = y[i];
			}
			if (x[i] > maxx) {
				maxx = x[i];
			}
			if (y[i] > maxy) {
				maxy = y[i];
			}
		}
		if (N == 1) {
			System.out.println(0);
		} else {
			System.out.println((maxx - minx) * (maxy - miny));
		}
	}
}