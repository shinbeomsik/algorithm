
package 프로그래머스풀기레벨1;


public class 가장가까운같은글자 {

	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		String s = "banana";

		int[] answer = sol.solution(s);
		System.out.println(answer);

	} 
}

class Solution35 {
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String[] arr = s.split("");
        
        for(int i=0;i<arr.length;i++) {
        		
        }
        
        return answer;
    }
}