package 프로그래머스풀기레벨0_1회차반복;



public class 접두사인지확인하기 {

	public static void main(String[] args) {
		Solution57 sol = new Solution57();
		String my_string = "banana" ;
		String is_prefix = "ban";
		
		int answer = sol.solution(my_string, is_prefix);
		System.out.println(answer);

	}
}

class Solution57 {
	 public int solution(String my_string, String is_prefix) {
	        int answer = 0;
	        if(is_prefix.length() < my_string.length() &&my_string.substring(0,is_prefix.length()).equals(is_prefix)){
	            answer = 1;
	        }
	        return answer;
	    }
}