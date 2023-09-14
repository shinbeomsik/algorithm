package 프로그래머스풀기레벨0;

public class 중복된문자제거 {

	public static void main(String[] args) {
		Solution91 sol = new Solution91();
		String my_string = "We are the world";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}  

// contains 메서드는 문자열이나 배열 등의 컨테이너에서 특정 요소가 포함되어 있는지를 확인하는 메서드
//           포함되어있으면true 아니면 false를 반환 
class Solution91 {
	public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        
        for (int i = 0; i < str.length; i++) {
            if (!answer.contains(str[i])) {
                answer += str[i];
            }
        }
        return answer;
    }  
}