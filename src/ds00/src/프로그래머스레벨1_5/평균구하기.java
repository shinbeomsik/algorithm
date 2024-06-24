package ds00.src.프로그래머스레벨1_5;



class Solution {
	public double solution(int[] arr) {
		double answer = 0;

		for(int i=0; i<arr.length; i++){
			answer = answer + arr[i];
		}

		answer = answer/arr.length;
		return answer;
	}
}