package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 무작위로k개의수뽑기 {

	public static void main(String[] args) {
		Solution179 sol = new Solution179();
		int[] arr = {};
		int k = 1;

		int[] answer = sol.solution(arr, k);
		System.out.println(answer);

	}
}

class Solution179 {
	public int[] solution(int[] arr, int k) {
		int [] answer = new int[k];
		Arrays.fill(answer, -1);   

        ArrayList <Integer> list = new ArrayList<>();
        
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                answer[count++] = arr[i];
                list.add(arr[i]);
                if (count == k) {
                	break;
                }
            }
        }
        return answer;
    }
}