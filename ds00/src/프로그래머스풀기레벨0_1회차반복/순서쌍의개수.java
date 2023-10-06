package 프로그래머스풀기레벨0_1회차반복;

public class 순서쌍의개수 {

	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		int n = 100;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution24 {
	 public int solution(int n) {
	        int answer = 0;
	        for(int i=1;i<=n;i++){
	            if(n%i==0){
	                answer++;
	            }
	        }
	        return answer;
	    }
}