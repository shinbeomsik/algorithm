package 프로그래머스풀기레벨1;



public class 문자열나누기 {

	public static void main(String[] args) {
		Solution54 sol = new Solution54();
		String s = "abracadabra";

		int answer = sol.solution(s);
		System.out.println(answer);

	} 
}

class Solution54 {
	 public int solution(String s) {
	        int answer = 1;

	        char x = s.charAt(0);
	        int count = 1;
	        for (int i = 1; i < s.length(); i++) {
	            if (count == 0) {
	                answer++;
	                x = s.charAt(i);
	            }

	            if (x == s.charAt(i)) {
	                count++;
	            } else {
	                count--;
	            }
	            
	            System.out.println(x);
	        }


	        return answer;
	    }
}