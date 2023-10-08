package 프로그래머스풀기레벨0_1회차반복;



public class 첫번째로나오는음수 {

	public static void main(String[] args) {
		Solution70 sol = new Solution70();
		int[] num_list = {};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution70 {
	  public int solution(int[] num_list) {
	        int answer = -1;
	        for(int i=0;i<num_list.length;i++){
	            if(num_list[i]<0){
	                answer = i;
	                break;
	            }
	        }
	        return answer;
	    }
}