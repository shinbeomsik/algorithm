package 프로그래머스풀기레벨0_1회차반복;



public class 머쓱이보다키큰사람 {

	public static void main(String[] args) {
		Solution32 sol = new Solution32();
		int[] array = {}; 
		int height = 1;

		int answer = sol.solution(array, height);
		System.out.println(answer);

	}
}

class Solution32 {
	 public int solution(int[] array, int height) {
	        int answer = 0;
	        for(int i=0;i<array.length;i++){
	            if(array[i] > height){
	                answer++;
	            }
	        }
	        return answer;
	    }
}