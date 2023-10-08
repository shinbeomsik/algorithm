package 프로그래머스풀기레벨0_1회차반복;



public class 조건에맞게수열변환하기3 {

	public static void main(String[] args) {
		Solution59 sol = new Solution59();
		int[] arr = {}; 
		int k =1;

		int[] answer = sol.solution(arr, k);
		System.out.println(answer);

	}
}

class Solution59 {
	 public int[] solution(int[] arr, int k) {
	        int[] answer = new int[arr.length];
	        if(k%2 !=0){
	            for(int i=0;i<arr.length;i++){
	                answer[i] = arr[i]*k;
	            }
	        }else{
	             for(int i=0;i<arr.length;i++){
	                answer[i] = arr[i] + k;
	            }
	        }
	        return answer;
	    }
}