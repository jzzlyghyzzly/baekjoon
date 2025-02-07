import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); //N은 그냥 필요없다며 입력만 받음
		int sum = 0;
		for (byte value : br.readLine().getBytes()) { // readLine으로 읽어들인 문자를 byte[] 로 변환해 반환되기에 for-each구문을 통해 문자열의 문자를 하나하나 읽음.
			sum += (value - '0'); // ASCII코드의 0의 값인 48을 빼주는 과정
		}
		br.close();
		System.out.println(sum);
	}
}
