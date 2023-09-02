
package 프로그래머스풀기레벨0;
import java.util.*;

public class 조건에맞게수열변환하기1 {

	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		int[] arr= {1, 2, 3, 100, 99, 98};

		int[] answer = sol.solution(arr);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution30 {
	   public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length];
	        for(int i = 0; i<arr.length;i++) {
	        	if(arr[i]>= 50 && arr[i]%2==0) {
	        		answer[i] = arr[i]/2;
	        	}else if(arr[i] <50 && arr[i]%2==1) {
	        		answer[i] = arr[i]*2;
	        	}else {
	        		answer[i] = arr[i];
	        	}
	        }
	        return answer;
	    }
}