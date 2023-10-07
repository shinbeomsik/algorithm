package 프로그래머스풀기레벨0_1회차반복;



public class 문자반복출력하기 {

	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		int n = 70;
		String my_string = "";
		String answer = sol.solution(my_string, n);
		System.out.println(answer);

	}
}

class Solution33 {
	 public String solution(String my_string, int n) {
	        String answer = "";
	        String[] arr = my_string.split("");
	        for(int i=0; i<arr.length; i++){
	            for(int j=0;j<n;j++){
	                answer =  answer + arr[i];
	            }
	        }
	        return answer;
	    }
}