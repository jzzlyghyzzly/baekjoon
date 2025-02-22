import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력받은 문자열에서 가장 많이 쓰인 알파벳을 대문자로 출력하는 문제
//문자열..
public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		// 받은 문자를 문자열로 하나씩 저장후 0번째값부터 단어문자열 하나에 반복으로 비교해서
		// 몇개나 같은지 체크 . 근데 같은 문자열을 또 체크할 수 있으니 겹치는 건 빼야함
		// 대문자로 출력 -> 입력받은 문자 모두 대문자로 변환 .toUpperCase();
		int count[] = new int[26]; // 알파벳은 26개임
		for (int i = 0; i < input.length(); i++) {
			int num = input.charAt(i) - 'A'; // 입력받은 문자의 문자열을 하나씩 아스키코드넘버로 'A'값을 빼서
			// 선언해놓은 count배열 해당 알파벳의 칸에 값을 증가시킴
			count[num]++;
		}
		int max = Integer.MIN_VALUE;
		char answer = '?';
		for (int i = 0; i < count.length; i++) { //count배열 루프로 한 번 싹 훑음
			if (max < count[i]) { //최댓값 업데이트
				max = count[i];
				answer = (char) (i + 'A'); // 아스키코드로 char형으로 출력하려는 것
			} else if (max == count[i]) { // 루프 중에 최댓값이 겹치는 게 있으면 ?를 출력함
				//그래도 break를 하면 안되는 이유 그 뒤에 값에 더 큰 값이 존재할 수 있기 때문임
				answer = '?';
			}
		}
		System.out.println(answer);
		br.close();
	}

}

//대문자 소문자 index범위 고려
//대문자 범위 십진수로 65~90
//소문자 범위 십진수로 97~122
//동일문자 찾는방법  대문자 -65 ( = 'A'), 소문자 -97 ( = 'a')
