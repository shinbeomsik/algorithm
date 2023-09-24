package 프로그래머스풀기레벨0;

import java.util.*;

public class 직사각형넓이구하기 {

	public static void main(String[] args) {
		Solution141 sol = new Solution141();
		int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

		int answer = sol.solution(dots);
		System.out.println(answer);

	}
}

class Solution141 {
	  public int solution(int[][] dots) {
	        int answer = 0;
	        int xmax = Math.abs(dots[0][0] - dots[1][0]);
	        int ymax = Math.abs(dots[0][1] - dots[1][1]);
	        
	        for(int i=0;i<dots.length-1;i++) {
	        	if(xmax < Math.abs(dots[i][0] - dots[i+1][0])) {
	        		xmax = Math.abs(dots[i][0] - dots[i+1][0]);
	        	}
	        	if(ymax < Math.abs(dots[i][1] - dots[i+1][1])) {
	        		ymax = Math.abs(dots[i][1] - dots[i+1][1]);
	        	}
	        }
	        answer = xmax * ymax;
	        return answer;
	    }
}