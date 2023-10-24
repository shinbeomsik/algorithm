package 프로그래머스풀기레벨1;



public class 둘만의암호 {

	public static void main(String[] args) {
		Solution55 sol = new Solution55();
		String s = "";
		String skip = "";
		int index = 1;

		String answer = sol.solution(s, skip, index);
		System.out.println(answer);

	} 
}
//문자열 s를 index만큼 다음 문자로 변환하여 변환된 문자가 skip에 포함된 문자면 건너뛰면서 문자열을 완성하여 반환하는 문제다.
//문자열 s를 순회하여 각 문자를 index만큼 다음 문자로 변환한다.
//변환하는 과정에서 while 문을 통해 count가 index보다 작으면 반복하여 ch가 z이면 a로, 아니면 다음 문자로 변환한다.
//만약 변환된 문자가 skip 문자열에 포함된 경우 count를 증가시켜 넘어간다.
//while 문을 벗어나면 StringBuilder에 변환된 문자 ch를 담는다

class Solution55 {
	public String solution(String s, String skip, int index) {
    	// 변환된 문자열을 저장하기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 문자열 s 순회
        for (char ch : s.toCharArray()) {
            // 변환 횟수 기록하기 위한 count
            int count = 0;
            
            // index 크기 만큼 순회하여 변환
            while (count < index) {
            	// 현재 문자 ch가 z이면 a로 변환, 아니면 다음 문자로 변환
                if (ch == 'z') {
                    ch = 'a';
                } else {
                    ch++;
                }

                // 현재 문자가 skip 문자열에 포함되지 않는 경우
                if (!skip.contains(String.valueOf(ch))) {
                    count++;
                }
            }
            // 변환된 문자 sb에 추가
            sb.append(ch);
        }
        return sb.toString();
    }
}