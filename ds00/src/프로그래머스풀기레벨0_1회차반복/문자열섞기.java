package 프로그래머스풀기레벨0_1회차반복;



public class 문자열섞기 {

	public static void main(String[] args) {
		Solution134 sol = new Solution134();
		String str1 = "";
		String str2 = "";
		String answer = sol.solution(str1, str2);
		System.out.println(answer);

	}
}

class Solution134 {
	 public String solution(String str1, String str2) {
	        String answer = "";
	        String[] arr = str1.split("");
	        String[] brr = str2.split("");
	        for(int i=0;i<arr.length;i++){
	            answer = answer + arr[i] + brr[i];
	        }
	        return answer;
	    }
}