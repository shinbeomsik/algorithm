package 프로그래머스풀기레벨0_1회차반복;

public class 자릿수더하기 {

	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution18 {
	 public int solution(int n) {
	        int answer = 0;
	        String a = n  + "";
	        String[] arr = a.split("");
	        for(int i=0;i<arr.length;i++){
	            answer = answer + Integer.parseInt(arr[i]);
	        }
	        return answer;
	    }
}