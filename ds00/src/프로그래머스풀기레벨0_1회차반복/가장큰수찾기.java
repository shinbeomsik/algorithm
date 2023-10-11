package 프로그래머스풀기레벨0_1회차반복;



public class 가장큰수찾기 {

	public static void main(String[] args) {
		Solution108 sol = new Solution108();
		int[] array = {};

		int[] answer = sol.solution(array);
		System.out.println(answer);

	}
}

class Solution108 {
	 public int[] solution(int[] array) {
	        int[] answer = new int[2];
	        
	        answer[0] = array[0];
	        answer[1] = 0;
	        
	        for(int i=0;i<array.length;i++){
	            if(answer[0] <array[i]){
	                answer[0] = array[i];
	                answer[1] = i;
	            }
	        }
	        
	        return answer;
	    }
}