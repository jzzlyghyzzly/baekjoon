import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split("\\s+");
		String reverseda = "";
		String reversedb ="";
		String a = input[0];
		String b = input[1];
		for (int i = a.length() - 1; i >= 0; i--) {
			reverseda += a.charAt(i);
		}
		for (int i = b.length() - 1; i >= 0; i--) {
			reversedb += b.charAt(i);
		}
		int a1 = Integer.parseInt(reverseda);
		int b1 = Integer.parseInt(reversedb);
		if(a1 > b1) {
			System.out.println(a1);
		} else {
			System.out.println(b1);
		}
		br.close();
	}

}
