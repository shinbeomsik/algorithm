package 프로그래머스풀기레벨0_1회차반복;



public class 홀짝에따라다른값반환하기 {

	public static void main(String[] args) {
		Solution90 sol = new Solution90();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution90 {
	 public int solution(int n) {
	        int answer = 0;
	        if(n%2 !=0){
	            for(int i=1;i<=n;i++){
	                if(i%2!=0){
	                answer = answer + i;
	                }
	            }
	        }else{
	            for(int i=1;i<=n;i++){
	                if(i%2==0){
	                    answer = answer  + i*i;
	                }
	            }
	        }
	        return answer;
	    }
}