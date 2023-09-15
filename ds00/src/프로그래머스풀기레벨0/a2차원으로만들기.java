package 프로그래머스풀기레벨0;


public class a2차원으로만들기 {

	public static void main(String[] args) {
		Solution97 sol = new Solution97();
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;

		int[][] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}  

class Solution97 {
	 public int[][] solution(int[] num_list, int n) {
	        int[][] answer = new int[num_list.length/n][n];
	        int index=0;
	        for(int i=0; i< answer.length; i++) {
	            int[] tmp = new int[n];
	            for(int k=0; k<n; k++) {
	                tmp[k] = num_list[index];
	                index++;
	            }
	            answer[i] = tmp;
	        }
	        return answer;
	    }
}