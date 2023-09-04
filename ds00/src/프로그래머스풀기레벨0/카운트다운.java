
package 프로그래머스풀기레벨0;

public class 카운트다운 {

	public static void main(String[] args) {
		Solution39 sol = new Solution39();
		int start =10;
		int end =3;

		int[] answer = sol.solution(start, end);
		System.out.println(answer);

	}
}

class Solution39 {
	  public int[] solution(int start, int end) {
	        int[] answer = new int[start-end+1];
	        for(int i=0;i<answer.length;i++) {
	        	answer[i] = start -i;
	        }
	        return answer;
	    }
}