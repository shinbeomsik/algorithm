package 프로그래머스풀기레벨0;

import java.util.*;

public class 문자열묶기 {

	public static void main(String[] args) {
		Solution117 sol = new Solution117();
		String[] strArr = {"a","bc","d","efg","hi" };

		int answer = sol.solution(strArr);
		System.out.println(answer);

	}
}

class Solution117 {
	public int solution(String[] strArr) {
		int answer = 0;
		
		int[] arr = new int[31];
		
		for(int i=0;i<strArr.length;i++) {
			arr[strArr[i].length()]++;
		}
		
		int max = arr[1];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		answer = max;
		System.out.println(Arrays.toString(arr));
		
		return answer;
	}
}