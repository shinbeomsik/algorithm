package 프로그래머스풀기레벨1_1회차반복;



public class 나머지가1이되는수찾기 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	} 
}

class Solution2 {
	 public int solution(int n) {
	        int answer = 0;
	        for(int i=1;i<=n;i++){
	            if(n%i == 1){
	                answer = i;
	                break;
	            }
	        }
	        return answer;
	    }
}