
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어 찾아내기
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		for (int i = 0; i <= input.length() / 2; i++) {
			if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
				if (i == input.length()/2) {
					System.out.println("1");
				}
			} else {
				System.out.println("0");
				break;
			}
		}

		br.close();
	}

}
