
package 프로그래머스풀기레벨1;

import java.util.*;
public class K번째수 {

	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] array = {1, 5, 2, 6, 3, 7, 4}; 
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		int[] answer = sol.solution(array, commands);
		System.out.println(Arrays.toString(answer));

	} 
}

class Solution34 {
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        for(int i=0;i<commands.length;i++) {
	        	List<Integer> krr = new ArrayList<>();
	        	for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++) {
	        		krr.add(array[j]);
	        	}
	        	Collections.sort(krr);
	        	answer[i] = krr.get(commands[i][2]-1);
	        }
	        return answer;
	    }
}