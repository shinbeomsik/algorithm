
package 프로그래머스풀기레벨1;


public class 가장가까운같은글자 {

	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		String s = "banana";

		int[] answer = sol.solution(s);
		System.out.println(answer);

	} 
}


//	for문을 돌려 i번째 글자 지정
//	i~0까지 i번째 글자와 같은 글자 찾아서 answer[i]에 저장
//	answer[i]가 0이 아니라면 이미 찾은 것이므로 넘어가기.
//	i~0까지의 for문을 끝낸 뒤, answer[i]가 0이라면 자신 앞에 같은 글자가 없는 것이므로 -1 저장
class Solution35 {
	public int[] solution(String s) {
		   int[] answer = new int[s.length()];
		        
		        for (int i = 0; i < s.length(); i++) {
					for (int j = i; j >= 0; j--) {
						if (s.charAt(i) == s.charAt(j) && answer[i] == 0) {
							answer[i] = i - j;
							
						}
					}
					if (answer[i] == 0) {
						answer[i] = -1;
					}
				}
		        
		        return answer;
		    }
}