package 프로그래머스풀기레벨1_1회차반복;


public class 최소직사각형 {

	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		int[][] sizes = {};

		int answer = sol.solution(sizes);
		System.out.println(answer);

	} 
}

class Solution35 {
	 public int solution(int[][] sizes) {
	        int answer = 0;
	        int max =0;
	        int min =0;
	        
	        for(int i=0;i<sizes.length;i++) {
	        	int x = Math.max(sizes[i][0], sizes[i][1]);
	        	int y = Math.min(sizes[i][0], sizes[i][1]);
	        	max = Math.max(max, x);
	        	min = Math.max(min, y);
	        }
	        answer = min*max;
	        return answer;
	    }
}