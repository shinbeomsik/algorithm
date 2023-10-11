package 프로그래머스풀기레벨1_1회차반복;



public class 내적 {

	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] a = {}; 
		int[] b = {};

		int answer = sol.solution(a, b);
		System.out.println(answer);
	} 
}

class Solution23 {
	 public int solution(int[] a, int[] b) {
	        int answer = 0;
	        
	        for(int i=0;i<a.length;i++){
	            answer =  answer + a[i]*b[i];
	        }
	        return answer;
	    }
}