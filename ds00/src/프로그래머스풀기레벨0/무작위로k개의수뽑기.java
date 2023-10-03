package 프로그래머스풀기레벨0;

import java.util.*;

public class 무작위로k개의수뽑기 {

	public static void main(String[] args) {
		Solution166 sol = new Solution166();
		int[] arr = {0,1,0,1};
		int k = 4;

		int[] answer = sol.solution(arr, k);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution166 {
	public int[] solution(int[] arr, int k) {
		int [] answer = new int[k];
		Arrays.fill(answer, -1);     //answer를 -1로 채워둠

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