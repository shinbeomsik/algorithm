package 프로그래머스풀기레벨0;

import java.util.*;

public class 배열조각하기 {

	public static void main(String[] args) {
		Solution152 sol = new Solution152();
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] query = {5, 2};
		//[3, 4, 5, 6]

		int[] answer = sol.solution(arr, query);
		System.out.println(Arrays.toString(answer));

	}
}

// 배열의 원하는 길이 만큼 잘라내는 Arrays.copyOfRange 메소드
class Solution152 {
	  public int[] solution(int[] arr, int[] query) {
	        for(int i=0; i<query.length; i++){
	            if(i%2==0){ // 짝수일 때 
	                arr = Arrays.copyOfRange(arr, 0, query[i]+1); 
	            }
	            else{ // 홀수일 때 
	                arr = Arrays.copyOfRange(arr, query[i], arr.length);
	            }
	        }
	    return arr;
	    }
}