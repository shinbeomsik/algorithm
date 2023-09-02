
package 프로그래머스풀기레벨0;
import java.util.*;

public class 조건에맞게수열변환하기3 {

	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;

		int[] answer = sol.solution(arr, k);
		System.out.println(answer);

	}
}

class Solution18 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if(k%2 ==0) {
        	for(int i =0; i<arr.length;i++) {
        		answer[i] = arr[i] + k;
        	}
        }else {
        	for(int i=0; i<arr.length;i++) {
        		answer[i] = arr[i]*k;
        	}
        }
        return answer;
    }
}