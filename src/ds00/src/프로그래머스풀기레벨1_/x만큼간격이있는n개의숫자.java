package 프로그래머스풀기레벨1_;



public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int n = 70;
		int x = 1;
		long[] answer = sol.solution(x, n);
		System.out.println(answer);

	} 
}

class Solution5 {
	 public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        for(int i=0;i<n;i++){
	            answer[i]  = (long)x*(i+1);
	        }
	        return answer;
	    }
}