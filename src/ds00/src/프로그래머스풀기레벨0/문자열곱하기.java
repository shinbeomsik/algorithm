
package 프로그래머스풀기레벨0;

public class 문자열곱하기 {

	public static void main(String[] args) {
		Solution42 sol = new Solution42();
		String my_string = "string";
		int k = 3;

		 String answer = sol.solution(my_string, k);
		System.out.println(answer);

	}
}

class Solution42 {
	 public String solution(String my_string, int k) {
	        String answer = "";
	        for(int i=0; i<k ;i++) {
	        	answer = answer +my_string;
	        }
	        return answer;
	    }
}