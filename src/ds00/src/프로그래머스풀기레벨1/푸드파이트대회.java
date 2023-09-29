
package 프로그래머스풀기레벨1;

import java.util.*;

public class 푸드파이트대회 {

	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		int[] food = {1, 7, 1, 2};

		String answer = sol.solution(food);
		System.out.println(answer);

	}
}

class Solution37 {
	public String solution(int[] food) {
		List<String> arr = new ArrayList<>();
		String answer = "";
		for (int i = 1; i < food.length; i++) {
			int count = 0;
			count = food[i] / 2;
			
			for(int j=0;j<count;j++) {
				arr.add(i+"");
			}
		}
		arr.add(0+"");
		
		int anslength = arr.size();
		for(int i=1;i<anslength;i++) {
			arr.add(arr.get(anslength-1-i));
		}
		
		for(int i=0;i<arr.size();i++) {
			answer = answer + arr.get(i);
		}
		return answer;
	}
}