package 프로그래머스풀기레벨0;

import java.util.*;

public class 배열만들기6 {

	public static void main(String[] args) {
		Solution164 sol = new Solution164();
		int[] arr = {0,1,0,0};

		int[] answer = sol.solution(arr);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution164 {
	public int[] solution(int[] arr) {

		List<Integer> brr = new ArrayList<>();
		int count = 0;
		while (count < arr.length) {
			if (brr.size() == 0) {
				brr.add(arr[count]);
				count++;
			} else {
				if (brr.get(brr.size() - 1) == arr[count]) {
					brr.remove(brr.size() - 1);
					count++;
				}else {
					brr.add(arr[count]);
					count++;
				}
			}
		}
		
		if (brr.size() < 1) {
			brr.add(-1);
		}
		
		int[] answer = new int[brr.size()];
		
		for(int i=0;i<brr.size();i++) {
			answer[i] = brr.get(i).intValue();
		}
		return answer;
	}
}