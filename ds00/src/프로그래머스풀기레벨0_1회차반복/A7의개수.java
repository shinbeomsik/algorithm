package 프로그래머스풀기레벨0_1회차반복;



public class A7의개수 {

	public static void main(String[] args) {
		Solution163 sol = new Solution163();
		int[] array = {};

		int answer = sol.solution(array);
		System.out.println(answer);

	}
}

class Solution163 {
	 public int solution(int[] array) {
	        int answer = 0;
	        
	        for(int i=0;i<array.length;i++){
	            String k = Integer.toString(array[i]);
	            String[] arr = k.split("");
	            
	            for(int j=0;j<arr.length;j++){
	                if(arr[j].equals("7")){
	                    answer++;
	                }
	            }
	        }
	        return answer;
	    }
}