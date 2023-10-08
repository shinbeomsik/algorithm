package 프로그래머스풀기레벨0_1회차반복;



public class n보다커질때까지더하기 {

	public static void main(String[] args) {
		Solution71 sol = new Solution71();
		int[] numbers = {};
		int n = 1;

		int answer = sol.solution(numbers, n);
		System.out.println(answer);

	}
}

class Solution71 {
	 public int solution(int[] numbers, int n) {
	        int answer = 0;
	        for(int i=0;i<numbers.length;i++){
	            answer = answer + numbers[i];
	            if(answer > n ){
	                break;
	            }
	        }
	        return answer;
	    }
}