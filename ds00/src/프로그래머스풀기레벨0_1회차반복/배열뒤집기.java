package 프로그래머스풀기레벨0_1회차반복;

public class 배열뒤집기 {

	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		int[] num_list = {1, 2, 3, 4, 5};

		int[] answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution20 {
	 public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length];
	        for(int i=0;i<num_list.length;i++){
	            answer[i] = num_list[num_list.length-1-i];
	        }
	        return answer;
	    }
}