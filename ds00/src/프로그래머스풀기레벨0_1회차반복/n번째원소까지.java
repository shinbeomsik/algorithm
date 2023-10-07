package 프로그래머스풀기레벨0_1회차반복;



public class n번째원소까지 {

	public static void main(String[] args) {
		Solution53 sol = new Solution53();
		int n = 70;
		int[] num_list = {};

		int[] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution53 {
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}