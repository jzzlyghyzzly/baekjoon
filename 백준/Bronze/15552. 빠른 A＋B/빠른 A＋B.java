import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] num = new int[T];
		
		//BufferedWriter.write() 는 문자열만 처리하므로, 정수를 문자열로 변환해야함
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" "); //이 파트가 제일 모르는 개념임
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			//두 개의 정수를 readLine()으로 받으면 각 줄에 정수가 하나 씩 있어야됨
			//근데 입력 시에는 정수하나를 입력하고 space바 한 번 누르고 또 입력하니까
			num[i] = a+b;
		}
		for(int i = 0; i<T;i++) {
			bw.write(num[i] +"");
			bw.newLine();
		} //정수를 문자열로 변환하여 출력
		
		bw.flush();	//출력 버퍼 비우기
		br.close();
		bw.close();
		

	}

}
