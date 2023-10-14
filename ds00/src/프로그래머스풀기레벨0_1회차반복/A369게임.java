package 프로그래머스풀기레벨0_1회차반복;



public class A369게임 {

	public static void main(String[] args) {
		Solution128 sol = new Solution128();
		int order = 70;

		int answer = sol.solution(order);
		System.out.println(answer);

	}
}

class Solution128 {
	 public int solution(int order) {
	        int answer = 0;
	        String k = Integer.toString(order);
	        String[] arr = k.split("");
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].equals("3") ||arr[i].equals("6") ||arr[i].equals("9")){
	                answer++;
	            }
	        }
	        return answer;
	    }
}