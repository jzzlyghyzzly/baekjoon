import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split("\\s+");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);
		
		int days = ((V - A) / (A - B)) + 1;
		if(((V-A) % (A-B)) != 0 ) { 
			days++;
		}
		System.out.println(days);
		br.close();
	}

}
