
package 프로그래머스풀기레벨0;

public class 꼬리문자열 {

	public static void main(String[] args) {
		Solution50 sol = new Solution50();
		String[] str_list = {"abc", "def", "ghi"}; 
		String ex = "ef";

		String answer = sol.solution(str_list, ex);
		System.out.println(answer);

	}
}  

class Solution50 {
	public String solution(String[] str_list, String ex) {
		 StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < str_list.length; i++) {
	            if (!str_list[i].contains(ex)) {
	                sb.append(str_list[i]);
	            }
	        }
	        String answer = sb.toString();
	        return answer;
    }
}