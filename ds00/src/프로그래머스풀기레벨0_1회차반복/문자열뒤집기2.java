package 프로그래머스풀기레벨0_1회차반복;



public class 문자열뒤집기2 {

	public static void main(String[] args) {
		Solution147 sol = new Solution147();
		String my_string ="";
		int s   =1;
		int e =1;

		String answer = sol.solution(my_string, s, e);
		System.out.println(answer);

	}
}

class Solution147 {
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