package 프로그래머스풀기레벨0_1회차반복;

public class 짝수홀수개수 {

	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		int[] num_list = {1, 2, 3, 4, 5};

		int[] answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution15 {
	 public int[] solution(int[] num_list) {
	        int[] answer = new int[2];
	        
	        for(int i=0;i<num_list.length;i++){
	            if(num_list[i]%2 ==0){
	                answer[0]++;
	            }else{
	                answer[1]++;
	            }
	        }
	        return answer;
	    }
}