package 프로그래머스풀기레벨0;

import java.util.*;

public class 배열만들기3 {

	public static void main(String[] args) {
		Solution84 sol = new Solution84();
		int[] arr = {1, 2, 3, 4, 5}; 
		int[][] intervals = {{1,3},{0,4}};

		List<Integer> answer = sol.solution(arr, intervals);
		System.out.println(answer);

	}
}  

class Solution84 {
	public  List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for(int i=intervals[0][0]; i <= intervals[0][1] ;i ++) {
        	answer.add(arr[i]);
        }
        for(int i=intervals[1][0]; i<= intervals[1][1] ;i++) {
        	answer.add(arr[i]);
        }
        return answer;
    }
}