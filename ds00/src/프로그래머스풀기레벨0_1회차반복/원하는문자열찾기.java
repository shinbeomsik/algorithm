package 프로그래머스풀기레벨0_1회차반복;



public class 원하는문자열찾기 {

	public static void main(String[] args) {
		Solution74 sol = new Solution74();
		String myString = ""; 
		String pat = "";

		int answer = sol.solution(myString, pat);
		System.out.println(answer);

	}
}

class Solution74 {
	 public int solution(String myString, String pat) {
	        int answer = 0;
	        myString = myString.toUpperCase();
	        pat = pat.toUpperCase();
	        
	        if(myString.contains(pat)){
	            answer =1;
	        }
	        return answer;
	    }
}