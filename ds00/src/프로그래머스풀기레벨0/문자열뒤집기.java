package 프로그래머스풀기레벨0;


public class 문자열뒤집기 {

	public static void main(String[] args) {
		Solution102 sol = new Solution102();
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;

		String answer = sol.solution(my_string, s, e);
		System.out.println(answer);

	}
}  

class Solution102 {
	  public String solution(String my_string, int s, int e) {
	        String answer = "";
	        int count = 0;
	        String[] arr = my_string.split("");
	        for(int i=0; i<arr.length;i++) {
	        	if( s<=i && i<=e) {
	        		answer = answer + arr[e-count];
	        		count++;
	        	}else {
	        		answer = answer + arr[i];
	        	}
	        }
	        return answer;
	    }
}