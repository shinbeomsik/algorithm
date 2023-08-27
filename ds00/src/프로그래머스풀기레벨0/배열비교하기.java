
package 프로그래머스풀기레벨0;

public class 배열비교하기 {

	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 3, 3, 3, 3};

		int answer = sol.solution(arr1, arr2);
		System.out.println(answer);

	}
}  

class Solution45 {
	 public int solution(int[] arr1, int[] arr2) {
	        int answer = 0;
	        int arr1max =0;
	        int arr2max =0;
	        if(arr1.length < arr2.length) {
	        	answer = -1;
	        }else if(arr1.length == arr2.length) {
	        	for(int i=0;i<arr1.length;i++) {
	        		arr1max = arr1max + arr1[i];
	        		arr2max = arr2max + arr2[i];
	        		if(arr1max > arr2max) {
	        			answer = 1;
	        		}else if(arr1max == arr2max) {
	        			answer = 0;
	        		}else if(arr1max < arr2max) {
	        			answer = -1;
	        		}
	        	}
	        }else if(arr1.length > arr2.length) {
	        	answer = 1;
	        }
	        return answer;
	    }
}