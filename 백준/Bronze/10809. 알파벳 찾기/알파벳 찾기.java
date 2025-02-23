import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력받은 문자의 문자열을 분석 후 abcdef---순으로 문자S에 해당 알파벳들이 몇번째에 쓰였는 지
		// 포함되지 않은 알파벳 들은 -1로 표시
		StringBuilder sb = new StringBuilder(); //이게 어떤 역할?
		
		String str = br.readLine();
		for(char c = 'a';c<='z';c++) {
			sb.append(str.indexOf(c)+ " " );  //문자열의 위치를 반환, 없으면 -1을 출력함
		}//append() stringbuilder에 문자열을 추가하는 메서드
		//str.indexOf(c) str문자열에서 문자c가 처음 등장하는 위치(인덱스)를 반환
		System.out.println(sb);
		br.close();
	}
}