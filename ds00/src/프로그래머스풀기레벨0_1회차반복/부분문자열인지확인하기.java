package 프로그래머스풀기레벨0_1회차반복;



public class 부분문자열인지확인하기 {

	public static void main(String[] args) {
		Solution62 sol = new Solution62();
		String my_string = ""; 
		String target = "";

		int answer = sol.solution(my_string, target);
		System.out.println(answer);

	}
}

class Solution62 {
	 public int solution(String my_string, String target) {
	        int answer = 0;
	        if(my_string.contains(target)){
	            answer = 1;
	        }
	        return answer;
	    }
}