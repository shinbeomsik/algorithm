package 프로그래머스풀기레벨0_1회차반복;



public class 문자열안에문자열 {

	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		String str1 = ""; 
		String str2 = "";

		int answer = sol.solution(str1, str2);
		System.out.println(answer);

	}
}

class Solution37 {
	 public int solution(String str1, String str2) {
	        int answer = 2;
	        if(str1.contains(str2)){
	            answer = 1;
	        }
	        return answer;
	    }
}