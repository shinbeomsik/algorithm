package 프로그래머스풀기레벨0_1회차반복;



public class qr코드 {

	public static void main(String[] args) {
		Solution165 sol = new Solution165();
		int q = 1; 
		int r = 1;
		String code ="";

		String answer = sol.solution(q, r, code);
		System.out.println(answer);

	}
}

class Solution165 {
	 public String solution(int q, int r, String code) {
	        String answer = "";
	        String[] arr = code.split("");
	        
	        for(int i=0;i<arr.length;i++){
	            if(i%q == r){
	                answer = answer + arr[i];
	            }
	        }
	        return answer;
	    }
}