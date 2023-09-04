
package 프로그래머스풀기레벨1;


public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		String s = "one4seveneight";

		int answer = sol.solution(s);
		System.out.println(answer);

	} 
}

class Solution31 {
	  public int solution(String s) {
	        int answer = 0;
	        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	        
	        for(int i=0; i<arr.length;i++) {
	        	s = s.replace(arr[i], Integer.toString(i));
	        }
	        answer = Integer.parseInt(s);
	        return answer;
	    }
}