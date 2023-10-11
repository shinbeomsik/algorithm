package 프로그래머스풀기레벨0_1회차반복;



public class 주사위의개수 {

	public static void main(String[] args) {
		Solution109 sol = new Solution109();
		int[] box = {};
		
		int n = 1;

		int answer = sol.solution(box, n);
		System.out.println(answer);

	}
}

class Solution109 {
	public int solution(int[] box, int n) {
        int answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
       
        return answer;
    }
}