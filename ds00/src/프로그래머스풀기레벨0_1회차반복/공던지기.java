package 프로그래머스풀기레벨0_1회차반복;



public class 공던지기 {

	public static void main(String[] args) {
		Solution168 sol = new Solution168();
		int[] numbers = {}; 
		int k = 1;

		int answer = sol.solution(numbers, k);
		System.out.println(answer);

	}
}

class Solution168 {
	 public int solution(int[] numbers, int k) {
	        int answer = 0;
	        int w = 0;
	        int i = 0;
	        while( w !=k-1){
	           i = (i +2)%numbers.length;
	            w++;
	        }
	        answer = numbers[i];
	        return answer;
	    }
}