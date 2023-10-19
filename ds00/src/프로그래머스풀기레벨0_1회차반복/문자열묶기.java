package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;
public class 문자열묶기 {

	public static void main(String[] args) {
		Solution159 sol = new Solution159();
		String[] strArr = {};

		int answer = sol.solution(strArr);
		System.out.println(answer);

	}
}

class Solution159 {
	public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31];
        
        for(int i=0;i<strArr.length;i++){
            arr[strArr[i].length()]++;
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        answer = max;

        return answer;
    }
}