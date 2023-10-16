package 프로그래머스풀기레벨0_1회차반복;



public class 배열의길이를2의거듭제곱으로만들기 {

	public static void main(String[] args) {
		Solution155 sol = new Solution155();
		int[] arr = {};

		int[] answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution155 {
	 public int[] solution(int[] arr) {
	        int len = arr.length;
	        
	        int pow = 0;
	        while(len > Math.pow(2, pow)) {
	            pow++;
	        }
	        
	        int[] answer = new int[(int)Math.pow(2, pow)];
	        for(int i = 0; i < len; i++) {
	            answer[i] = arr[i];
	        }
	        return answer;
	    }
}