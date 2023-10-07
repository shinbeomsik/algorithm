package 프로그래머스풀기레벨0_1회차반복;



public class 피자나눠먹기3 {

	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		int n = 70;
		int slice =1;
		int answer = sol.solution(slice, n);
		System.out.println(answer);

	}
}

class Solution31 {
	 public int solution(int slice, int n) {
	        int answer = 0;
	        answer = n/slice;
	        if(n%slice !=0 ){
	            answer++;
	        }
	        return answer;
	    }
}