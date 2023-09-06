
package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 공백으로구분하기2 {

	public static void main(String[] args) {
		Solution51 sol = new Solution51();
		String my_string = " i    love  you";

		String[] answer = sol.solution(my_string);
		System.out.println(answer);
	}
}

class Solution51 {
	  public String[] solution(String my_string) {
	        String[] answer = my_string.trim().split("\\s+");
	        
	        //trim() 은 문자열 앞과 뒤쪽  예)" i  love  you  " ==> "i  love  you" 이렇게된다
	        //split("\\s+") split()이거는 문자열을 분할 하라는것인데 여기서 "\\s+" 
	        //   \\: 역슬래시(\)는 Java 문자열에서 이스케이프 문자로 사용되므로
	        // 		, 실제로 역슬래시 문자를 나타내려면 두 번 적어야 합니다.
	        //   s: s는 공백 문자를 나타내는 메타 문자입니다.
	        //   +: +는 앞의 패턴이 하나 이상의 연속된 공백 문자와 일치해야 함을 나타냅니다.
	        
 	        return answer;
 	        
	    }
}