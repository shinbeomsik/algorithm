package 프로그래머스풀기레벨0_1회차반복;



public class my_string {

	public static void main(String[] args) {
		Solution64 sol = new Solution64();
		String rny_string = "";

		String answer = sol.solution(rny_string);
		System.out.println(answer);

	}
}

class Solution64 {
	 public String solution(String rny_string) {
	        String answer = "";
	        answer = rny_string.replaceAll("m" , "rn");
	        return answer;
	    }
}