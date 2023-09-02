
package 프로그래머스풀기레벨2;


public class 최댓값과최솟값 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		String s = "-1 -1";

		String answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution1 {
	  public String solution(String s) {
	        String answer = "";
	        String[] www = s.split(" ");
	        int[] sss = new int[www.length];
	        for(int i=0;i<www.length;i++) {
	        	sss[i] = Integer.parseInt(www[i]);
	        }
	        int max = sss[0];
	        int min = sss[0];
	        
	        for(int i=0; i<sss.length;i++) {
	        	if(max < sss[i]) {
	        		max = sss[i];
	        	}
	        	if(min > sss[i]) {
	        		min = sss[i];
	        	}
	        }
	        answer = min + " " + max;
	        return answer;
	    }
}