package 프로그래머스풀기레벨0;


public class 세로읽기 {

	public static void main(String[] args) {
		Solution92 sol = new Solution92();
		String my_string = "ab";
		int m = 2;
		int c = 2;

		String answer = sol.solution(my_string, m, c);
		System.out.println(answer);

	}
}  

class Solution92 {
	 public String solution(String my_string, int m, int c) {
	        String answer = "";
	        String[] arr = my_string.split("");
	        
	        if(m==1 && c==1) {
	        	answer = my_string;
	        }else {
	        	for (int i=0; i<arr.length;i++) {
	        		if(i%m == c-1) {
	        			answer = answer + arr[i];
	        		}
	        	}
	        }
	        
	        return answer;
	    }
}