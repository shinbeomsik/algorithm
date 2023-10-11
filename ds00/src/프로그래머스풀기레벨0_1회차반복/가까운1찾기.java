package 프로그래머스풀기레벨0_1회차반복;



public class 가까운1찾기 {

	public static void main(String[] args) {
		Solution107 sol = new Solution107();
		int[] arr = {};
		int idx = 1;

		int answer = sol.solution(arr, idx);
		System.out.println(answer);

	}
}

class Solution107 {
	 public int solution(int[] arr, int idx) {
	        int answer = -1;
	        for(int i=idx;i<arr.length;i++){
	            if(arr[i] == 1){
	                answer = i;
	                break;
	            }
	        }
	        return answer;
	    }
}