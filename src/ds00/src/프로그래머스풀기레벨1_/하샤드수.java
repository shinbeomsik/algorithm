package 프로그래머스풀기레벨1_;



public class 하샤드수 {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int x = 70;

		boolean answer = sol.solution(x);
		System.out.println(answer);
	} 
}

class Solution12 {
	 public boolean solution(int x) {
	        boolean answer = true;
	        String k = Integer.toString(x);
	        String[] krr = k.split("");
	        int plus = 0;
	        for(int i=0;i<krr.length;i++){
	            plus = plus + Integer.parseInt(krr[i]);
	        }
	     
	        if(x % plus !=0){
	            answer = false;
	        }
	        return answer;
	    }
}