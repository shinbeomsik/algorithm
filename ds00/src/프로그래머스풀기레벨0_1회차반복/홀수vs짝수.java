package 프로그래머스풀기레벨0_1회차반복;



public class 홀수vs짝수 {

	public static void main(String[] args) {
		Solution84 sol = new Solution84();
		int[] num_list = {};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution84 {
	 public int solution(int[] num_list) {
	        int answer = 0;
	        int odd = 0;
	        int even = 0;
	        for(int i=0;i<num_list.length;i++){
	            if(i%2==0){
	                odd = odd + num_list[i];
	            }else{
	                even += num_list[i];
	            }
	        }
	        
	        if(odd > even){
	            answer = odd;
	        }else{
	            answer = even;
	        }
	        return answer;
	    }
}