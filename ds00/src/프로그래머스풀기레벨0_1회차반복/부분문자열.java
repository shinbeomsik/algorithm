package 프로그래머스풀기레벨0_1회차반복;



public class 부분문자열 {

	public static void main(String[] args) {
		Solution50 sol = new Solution50();
		String str1 = "";
		String str2 = "";

		int answer = sol.solution(str1, str2);
		System.out.println(answer);

	}
}

class Solution50 {
	 public int solution(String str1, String str2) {
	        int answer = 0;
	        if(str2.contains(str1)){
	            answer = 1;
	        }
	        return answer;
	    }
}