
package 프로그래머스풀기레벨1;


public class 최소직사각형 {

	public static void main(String[] args) {
		Solution29 sol = new Solution29();
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

		int answer = sol.solution(sizes);
		System.out.println(answer);

	}
}

class Solution29 {
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