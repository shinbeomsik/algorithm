package 프로그래머스풀기레벨0_1회차반복;



public class 조건에맞게수열변환하기1 {

	public static void main(String[] args) {
		Solution68 sol = new Solution68();
		int[] arr= {};

		int[] answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution68 {
	 public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length];
	        for(int i=0;i<arr.length;i++){
	            if(arr[i] >= 50  && arr[i]%2==0){
	                answer[i] = arr[i]/2; 
	            }else if(arr[i] < 50 &&  arr[i]%2 !=0){
	                answer[i] = arr[i]*2;
	            }else{
	                answer[i] = arr[i];
	            }
	        }
	        return answer;
	    }
}