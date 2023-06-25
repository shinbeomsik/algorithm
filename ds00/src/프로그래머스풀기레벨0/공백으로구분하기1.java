
package 프로그래머스풀기레벨0;

public class 공백으로구분하기1 {

	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		String my_string = "i love you"	;

		String[] answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution40 {
	  public String[] solution(String my_string) {
	        String[] answer = {};
	        answer = my_string.split(" ");
	        return answer;
	    }
}