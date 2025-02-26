import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'c') {
				if (i + 1 < S.length() && (S.charAt(i + 1) == '=' || S.charAt(i + 1) == '-')) {
					i++;
				}
			} else if (c == 'd') {
				if (i + 1 < S.length() && S.charAt(i + 1) == 'z') {
					if (i + 2 < S.length() && S.charAt(i + 2) == '=') {
						i += 2;
					}
				} else if(i+1 < S.length() &&S.charAt(i+1) =='-') {
					i++;
				}
			} else if ((c == 'l' || c == 'n') && i + 1 < S.length() && S.charAt(i + 1) == 'j') {
				i++;
			} else if ((c == 's' || c == 'z') && i + 1 < S.length() && S.charAt(i + 1) == '=') {
				i++;
			}
			count++;
		}
		System.out.println(count);
		br.close();
	}

}
