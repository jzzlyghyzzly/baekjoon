import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numInput = br.readLine().trim().split("\\s+");
		int N = Integer.parseInt(numInput[0]); // 박스개수
		int M = Integer.parseInt(numInput[1]); // 앞으로 입력받을 횟수
		int box[] = new int[N];
		// 바구니에 값을 저장해야 함 1,2,3,4,5
		for (int k = 0; k < N; k++) {
			box[k] = k + 1;
		}
//		int reverse[] = box.clone(); // 아주 잘못됨. .clone()으로 해결 , 근데 불필요함
//		// reverse를 변경하게 되면 box도 변경됨 같은 메모리를 가르키게 되기 때문
//		// 새로운 배열을 생성해서 복사해야 함
		for (int k = 0; k < M; k++) {
			String[] input = br.readLine().trim().split("\\s+");
			int i = Integer.parseInt(input[0]) - 1; // 여기서 인덱스로 접근할 생각 i,j는 번째 칸을 세는 것이기 때문
			int j = Integer.parseInt(input[1]) - 1;
			/*
			 * // i부터 j칸 까지니까 box[i-1]부터 box[j-1]까지 reverse에 저장을 해야함 // 박스 값 뒤집기 for (int n
			 * = j - 1, q = i - 1; n >= i - 1; q++, n--) { // n이 감소하면서 i-1까지 가야함 reverse[q]
			 * = box[n]; // 왜 인덱스 -1까지... } for (int n = i - 1; n < reverse.length; n++) {
			 * box[n] = reverse[n]; } } for (int q = 0; q < N; q++) {
			 * System.out.print(box[q] + " "); }
			 */
			while (i < j) {
				int temp = box[i]; /*
				내가 생각했었던 reverse는 아예 불필요했음
				그래서 temp에i칸에 든 수를 저장해놓고
				j칸에 든 수를 i에 넣고
				temp에 저장해놓은 수를 j에 넣어준다
				j가 1씩 작아지며, i가 1씩 커지며 서로 바뀜
				*/
				box[i] = box[j];
				box[j] = temp;
				i++;
				j--; // 0<= i < j
			}
		}
		for (int n = 0; n < N; n++) {
			System.out.print(box[n] + " ");
		}
	}
}