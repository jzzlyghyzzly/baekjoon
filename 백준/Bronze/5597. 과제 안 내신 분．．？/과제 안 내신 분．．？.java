import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//없는 번호 찾는 문제 '2명'

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] submitted = new boolean[30]; // 학생 번호 존재 여부 체크 배열
		for (int i = 0; i < 28; i++) { // 2명이 안내서 제출인원을 2명적은 28로 했어야 했는데 계속 30으로 해놓고 안끝났다 이러고 있엇음...
			int num = Integer.parseInt(br.readLine());
			submitted[num - 1] = true; // 출석한 학생 해당 번호에 체크
		}
		br.close(); //입력 활동 종료
		for (int i = 0; i < 30; i++) {
			if (!submitted[i]) { //submitted[] 결과가 true가 아닐때
				System.out.println(i + 1); //미제출학생번호 출력
			}
		}

	}
}
