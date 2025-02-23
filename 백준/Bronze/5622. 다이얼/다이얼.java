import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int time = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'A' || input.charAt(i) == 'B' || input.charAt(i) == 'C') {
				time += 2;
			} else if (input.charAt(i) == 'D' || input.charAt(i) == 'E' || input.charAt(i) == 'F') {
				time += 3;
			} else if (input.charAt(i) == 'G' || input.charAt(i) == 'H' || input.charAt(i) == 'I') {
				time += 4;
			} else if (input.charAt(i) == 'J' || input.charAt(i) == 'K' || input.charAt(i) == 'L') {
				time += 5;
			} else if (input.charAt(i) == 'M' || input.charAt(i) == 'N' || input.charAt(i) == 'O') {
				time += 6;
			} else if (input.charAt(i) == 'P' || input.charAt(i) == 'Q' || input.charAt(i) == 'R'
					|| input.charAt(i) == 'S') {
				time += 7;
			} else if (input.charAt(i) == 'T' || input.charAt(i) == 'U' || input.charAt(i) == 'V') {
				time += 8;
			} else if (input.charAt(i) == 'W' || input.charAt(i) == 'X' || input.charAt(i) == 'Y'
					|| input.charAt(i) == 'Z') {
				time += 9;
			}
		}
		System.out.println(time + input.length() * 1);
		br.close();
	}

}
