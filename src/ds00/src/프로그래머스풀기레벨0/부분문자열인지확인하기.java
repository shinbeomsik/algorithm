
package 프로그래머스풀기레벨0;

public class 부분문자열인지확인하기 {

	public static void main(String[] args) {
		Solution41 sol = new Solution41();
		String my_string = "banana"	;
		String target = "anaa";

		int answer = sol.solution(my_string, target);
		System.out.println(answer);

	}
}

class Solution41 {
	  public int solution(String my_string, String target) {
	        int answer = 0;
	        if(my_string.contains(target)) {
	        	answer =1;
	        }
	        return answer;
	    }
}