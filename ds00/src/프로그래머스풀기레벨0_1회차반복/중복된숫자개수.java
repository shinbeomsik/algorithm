package 프로그래머스풀기레벨0_1회차반복;

public class 중복된숫자개수 {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		int[] array = {1, 1, 2, 3, 4, 5}; 
		int n = 1;

		int answer = sol.solution(array, n);
		System.out.println(answer);

	}
}

class Solution17 {
	 public int solution(int[] array, int n) {
	        int answer = 0;
	        for(int i=0;i<array.length;i++){
	            if(array[i] == n){
	                answer++;
	            }
	        }
	        return answer;
	    }
}