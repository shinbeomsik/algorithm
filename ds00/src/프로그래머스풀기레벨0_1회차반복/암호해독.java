package 프로그래머스풀기레벨0_1회차반복;



public class 암호해독 {

	public static void main(String[] args) {
		Solution102 sol = new Solution102();
		String cipher = "" ; 
		int code = 1;

		String answer = sol.solution(cipher, code);
		System.out.println(answer);

	}
}

class Solution102 {
	 public String solution(String cipher, int code) {
	        String answer = "";
	        String[] arr = cipher.split("");
	        for(int i=code-1;i<arr.length;i= i + code){
	            answer = answer +  arr[i];
	        }
	        return answer;
	    }
}