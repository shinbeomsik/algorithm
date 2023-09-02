
package 프로그래머스풀기레벨1;

import java.util.*;

public class 크기가작은부분문자열 {

	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		String t = "3141592";
		String p = "271";

		int answer = sol.solution(t, p);
		System.out.println(answer);

	}
}

class Solution28 {
	  public int solution(String t, String p) {
	        int answer = 0;
	        //int 로 하면 범위가 넘어갈때가 있는듯
	        long num = Long.parseLong(p);
	        
	        for (int i = 0; i < t.length() - p.length() + 1; i++) {
	            String s = t.substring(i, i + p.length());
	            if (Long.parseLong(s) <= num) {
	                answer++;
	            }
	        }
	        return answer;
	    }
}