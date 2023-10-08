package 프로그래머스풀기레벨0_1회차반복;



public class 이어붙인수 {

	public static void main(String[] args) {
		Solution79 sol = new Solution79();
		int[] num_list = {};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution79 {
	  public int solution(int[] num_list) {
	        int answer = 0;
	         String p = "";
	        String q = "";
	        for(int i=0;i<num_list.length;i++){
	         
	            if(num_list[i]%2 !=0){
	                p = p + Integer.toString(num_list[i]);
	            }else{
	                q = q + Integer.toString(num_list[i]);
	            }
	          
	        }
	            answer = Integer.parseInt(p) + Integer.parseInt(q);
	        return answer;
	    }
}