package 프로그래머스풀기레벨0_1회차반복;



public class 부분문자열이어붙여문자열만들기 {

	public static void main(String[] args) {
		Solution81 sol = new Solution81();
		String[] my_strings ={}; 
		int[][] parts = {};

		String answer = sol.solution(my_strings, parts);
		System.out.println(answer);

	}
}

class Solution81 {
	  public String solution(String[] my_strings, int[][] parts) {
	        String answer = "";
	        int count =0;
	        for(int i=0;i<my_strings.length;i++){
	            answer = answer + my_strings[i].substring(parts[count][0],parts[count][1]+1);
	            count++;
	        }
	        return answer;
	    }
}