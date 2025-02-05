import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//10813 공바꾸기
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		/*
		 * String input1 = br.readLine(); 
		 * String input2 = br.readLine(); 
		 * int N = Integer.parseInt(input1); //N은 바구니의 개수 
		 * int M = Integer.parseInt(input2); //M은 공을바꾸려는 횟수
         * 이 부분이 왜 틀렸을까나..
		 */		
        int box[] = new int[N];
		for (int i = 0; i < N; i++) {
			box[i] = i + 1;
		} // 맨처음 박스의 상태
			// M번 공을 바꿀거임
		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int temp;
			temp = box[a-1];
			box[a-1] = box[b-1];
			box[b-1] = temp;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(box[i] + " ");
		}
	}

}
