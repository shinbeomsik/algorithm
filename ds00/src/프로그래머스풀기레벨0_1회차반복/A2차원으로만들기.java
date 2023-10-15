package 프로그래머스풀기레벨0_1회차반복;



public class A2차원으로만들기 {

	public static void main(String[] args) {
		Solution141 sol = new Solution141();
		int n = 70;
		int[] num_list = {};
		int[][] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution141 {
	public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int count =0;
        for(int i=0;i<num_list.length/n;i++){
            for(int j=0;j<n;j++){
                answer[i][j] = num_list[count];
                count++;
            }
        }
        return answer;
    }
}