package 프로그래머스풀기레벨0_1회차반복;



public class 문자열뒤집기 {

	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		String my_string= "";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution28 {
	 public String solution(String my_string) {
	        String answer = "";
	        String[] arr = my_string.split("");
	        for(int i=0;i<arr.length;i++){
	            answer += arr[arr.length-1-i];
	        }
	        
	        return answer;
	    }
}