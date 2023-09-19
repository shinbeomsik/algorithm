package 프로그래머스풀기레벨0;

import java.util.*;
public class a7의개수 {

	public static void main(String[] args) {
		Solution120 sol = new Solution120();
		int[] array = {7, 77, 17};

		int answer = sol.solution(array);
		System.out.println(answer);

	}
}  

class Solution120 {
	public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length;i++) {
        	String num = Integer.toString(array[i]);
        	String[] arr  = num.split("");
        	
        	for(int j=0;j<arr.length;j++) {
        		if(arr[j].equals("7")) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}