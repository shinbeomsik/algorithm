package 프로그래머스풀기레벨1_1회차반복;



public class 평균구하기 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] arr = {};

		double answer = sol.solution(arr);
		System.out.println(answer);

	} 
}

class Solution4 {
	 public double solution(int[] arr) {
	        double answer = 0;
	        for(int i=0;i<arr.length;i++){
	            answer = answer + arr[i];
	        }
	        answer = answer/arr.length;
	        return answer;
	    }
}