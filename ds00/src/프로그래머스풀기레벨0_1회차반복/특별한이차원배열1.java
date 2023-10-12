package 프로그래머스풀기레벨0_1회차반복;



public class 특별한이차원배열1 {

	public static void main(String[] args) {
		Solution115 sol = new Solution115();
		int n = 70;

		int[][] answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution115 {
	 public int[][] solution(int n) {
	        int[][] answer = new int[n][n];
	        	char t  = 'a';
	        String k = Character.toString(t);
	        char r = '1' + 48;
	        System.out.println(r);
	        for(int i=0;i<answer.length;i++){
	         
	            for(int j=0;j<answer[0].length;j++){
	               if(i==j){
	                   answer[i][j]  =1;
	                   break;
	               }
	            }
	        }
	        return answer;
	    }
}