package 프로그래머스풀기레벨1_1회차반복;



public class 수박수박수박수박수박 {

	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		int n = 70;

		String answer = sol.solution(n);
		System.out.println(answer);
	} 
}

class Solution22 {
	 public String solution(int n) {
	        String answer = "";
	        for(int i=1; i<=n;i++){
	            if(i%2 !=0){
	                answer = answer + "수";
	            }else{
	                answer = answer + "박";
	            }
	        }
	        return answer;
	    }
}