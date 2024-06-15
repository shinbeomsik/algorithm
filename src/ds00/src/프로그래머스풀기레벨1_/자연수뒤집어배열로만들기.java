package 프로그래머스풀기레벨1_1회차반복;



public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		long n = 70;

		int[] answer = sol.solution(n);
		System.out.println(answer);

	} 
}

class Solution7 {
	  public int[] solution(long n) {
	        String k = Long.toString(n);
	        String[] arr = k.split("");
	        int[] answer = new int[k.length()];
	        
	        for(int i=0; i<k.length();i++){
	            answer[i] = Integer.parseInt(arr[k.length()-1-i]);
	        }
	        return answer;
	    }
}