import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int qdnp[][] = new int[T][4];
		int change[] = new int[T];
		int course = 0;
		for (int i = 0; i < T; i++) {
			change[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0) {
					qdnp[i][j] = change[i] / 25;
					
				} else if (j == 1) {
					qdnp[i][j] = change[i]%25/10;					
				} else if (j == 2) {
					qdnp[i][j] = change[i]%25%10/5;
				} else {
					qdnp[i][j] = change[i]%25%10%5;
				}
			}
		}
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(qdnp[i][j]+ " ");
			}
			System.out.println();
		}
		br.close();
	}
}