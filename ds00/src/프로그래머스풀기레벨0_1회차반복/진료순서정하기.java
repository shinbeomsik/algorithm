package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 진료순서정하기 {

	public static void main(String[] args) {
		Solution153 sol = new Solution153();
		int[] emergency = {};

		int[] answer = sol.solution(emergency);
		System.out.println(answer);

	}
}

class Solution153 {
	public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = new int[emergency.length];
        for(int i=0;i<emergency.length;i++){
            arr[i] = emergency[i];
        }
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(emergency[i] == arr[j]){
                    answer[i] = arr.length-j;
                }
            }
        }
        return answer;
    }
}