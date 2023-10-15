package 프로그래머스풀기레벨0_1회차반복;



public class 팩토리얼 {

	public static void main(String[] args) {
		Solution145 sol = new Solution145();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution145 {
	 public int solution(int n) {
	        int answer = 0;
	        int k=1;
	        int i=1;
	        while(k<=n){
	            k = k*(answer+1);
	            answer++;
	        }
	        
	        if(k!=n){
	            answer = answer -1;
	        }
	        return answer;
	    }
}