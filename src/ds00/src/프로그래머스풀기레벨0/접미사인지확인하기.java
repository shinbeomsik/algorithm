
package 프로그래머스풀기레벨0;

public class 접미사인지확인하기 {

	public static void main(String[] args) {
		Solution46 sol = new Solution46();
		String my_string = "banana";
		String is_suffix = "ana";

		int answer = sol.solution(my_string, is_suffix);
		System.out.println(answer);

	}
}  

class Solution46 {
	 public int solution(String my_string, String is_suffix) {
	        int answer = 0;
	        
	        for(int i=0; i<my_string.length();i++) {
	        	String str = my_string.substring(i,my_string.length());
	        	if(str.equals(is_suffix)) {
	        		answer =1;
	        	}
	        }
	        return answer;
	    }
}