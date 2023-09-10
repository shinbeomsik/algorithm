
package 프로그래머스풀기레벨0;

public class 주사위의개수 {

	public static void main(String[] args) {
		Solution69 sol = new Solution69();
		int[] box = {10, 8, 6};
		int n = 3;

		int answer = sol.solution(box, n);
		System.out.println(answer);

	}
}  

class Solution69 {
	 public int solution(int[] box, int n) {
	        int answer = 0;
	        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
	        return answer;
	    }
}