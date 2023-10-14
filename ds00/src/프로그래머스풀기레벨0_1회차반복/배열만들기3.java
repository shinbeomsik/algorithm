package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 배열만들기3 {

	public static void main(String[] args) {
		Solution125 sol = new Solution125();
		int[] arr = {}; 
		int[][] intervals = {};

		List<Integer> answer = sol.solution(arr, intervals);
		System.out.println(answer);

	}
}

class Solution125 {
	public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=intervals[0][0];i<intervals[0][1]+1;i++){
            answer.add(arr[i]);
        }
        for(int i=intervals[1][0];i<intervals[1][1]+1;i++){
            answer.add(arr[i]);
        }
        
        return answer;
    }
}