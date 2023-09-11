package 프로그래머스풀기레벨0;


public class 가까운1찾기 {

	public static void main(String[] args) {
		Solution72 sol = new Solution72();
		int[] arr = {1, 1, 1, 1, 0}; 
		int idx = 3;

		int answer = sol.solution(arr, idx);
		System.out.println(answer);

	}
}  

class Solution72 {
	public int solution(int[] arr, int idx) {
        int answer = -1;
        for(int i=idx;i<arr.length;i++) {
        	if(arr[i] == 1) {
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
}