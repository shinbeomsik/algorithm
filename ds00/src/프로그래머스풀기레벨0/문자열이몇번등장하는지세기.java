package 프로그래머스풀기레벨0;


public class 문자열이몇번등장하는지세기 {

	public static void main(String[] args) {
		Solution112 sol = new Solution112();
		String myString = "aaaa"; 
		String pat = "aa";

		int answer = sol.solution(myString, pat);
		System.out.println(answer);

	}
}  

class Solution112 {
	public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<=myString.length() - pat.length();i++) {
        	if(myString.substring(i, i+pat.length()).contains(pat)) {
        		answer++;
        	}
        }
        return answer;
    }
}