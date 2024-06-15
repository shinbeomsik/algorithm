package 프로그래머스풀기레벨1_;



public class 음양더하기 {

	public static void main(String[] args) {
		Solution16 sol = new Solution16();
		int[] absolutes = {}; 
		boolean[] signs = {};

		int answer = sol.solution(absolutes, signs);
		System.out.println(answer);
	} 
}

class Solution16 {
	  public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        for(int i=0;i<signs.length;i++){
	            if(signs[i] == true){
	                answer = answer + absolutes[i];
	            }else{
	                  answer = answer - absolutes[i];
	            }
	        }
	        return answer;
	    }
}