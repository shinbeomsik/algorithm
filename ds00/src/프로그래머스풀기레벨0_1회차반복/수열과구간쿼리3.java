package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 수열과구간쿼리3 {

	public static void main(String[] args) {
		Solution146 sol = new Solution146();
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3},{1, 2},{1, 4}};

		int[] answer = sol.solution(arr, queries);
		System.out.println(answer);

	}
}

class Solution146 {
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i=0;i<queries.length;i++){
        	 int index1 = queries[i][0];
             int index2 = queries[i][1];
             int temp = arr[index1];
             arr[index1] = arr[index2];
             arr[index2] = temp;
        }
        
        for(int i=0;i<arr.length;i++){
            answer[i] =arr[i];
        }
        return answer;
    }
}