package 프로그래머스풀기레벨0_1회차반복;



public class 더크게합치기 {

	public static void main(String[] args) {
		Solution69 sol = new Solution69();
		int a = 1;
		int b = 1;

		int answer = sol.solution(a, b);
		System.out.println(answer);

	}
}

class Solution69 {
	 public int solution(int a, int b) {
	        int answer = 0;
	        String ab = Integer.toString(a) + Integer.toString(b);
	        String ba = Integer.toString(b) + Integer.toString(a);
	        
	        if(Integer.parseInt(ab) >  Integer.parseInt(ba)){
	            answer = Integer.parseInt(ab);
	        }else{
	              answer = Integer.parseInt(ba);
	        }
	        
	        return answer;
	    }
}