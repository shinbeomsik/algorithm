package 프로그래머스풀기레벨0_1회차반복;



public class 배열만들기1 {

	public static void main(String[] args) {
		Solution66 sol = new Solution66();
		int n =1; 
		int k = 1;

		int[] answer = sol.solution(n, k);
		System.out.println(answer);

	}
}

class Solution66 {
	  public int[] solution(int n, int k) {
	        int[] answer = new int[n/k];
	        int count = 0;
	        for(int i=1;i<=n;i++){
	            if(i%k ==0){
	                answer[count] = i;
	                count++;
	            }
	        }
	        return answer;
	    }
}