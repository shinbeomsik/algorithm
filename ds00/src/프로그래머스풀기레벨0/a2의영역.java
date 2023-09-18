package 프로그래머스풀기레벨0;

import java.util.*;
public class a2의영역 {

	public static void main(String[] args) {
		Solution115 sol = new Solution115();
		int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};

		int[] answer = sol.solution(arr);
		System.out.println(answer);

	}
}  

class Solution115 {
    public int[] solution(int[] arr) {
        int min = 100000, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        if (min <= max) {
            return Arrays.copyOfRange(arr, min, max + 1);
        } else {
            return new int[]{-1};
        }
    }
}