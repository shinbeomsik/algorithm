package 프로그래머스풀기레벨0_1회차반복;



public class 꼬리문자열 {

	public static void main(String[] args) {
		Solution75 sol = new Solution75();
		String[] str_list = {};
		String ex = " ";

		String answer = sol.solution(str_list, ex);
		System.out.println(answer);

	}
}

class Solution75 {
	   public String solution(String[] str_list, String ex) {
	        String answer = "";
	        for(int i=0;i<str_list.length;i++){
	            if(!str_list[i].contains(ex)){
	                answer = answer + str_list[i];
	            }
	        }
	        return answer;
	    }
}