
package 프로그래머스레벨1_3;

import java.util.*;
public class k번쨰수 {
	   
}

class Solution32 {
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        for(int i=0; i<commands.length; i++){
	            List<Integer> arr = new ArrayList<>();
	            for(int j=commands[i][0]; j<=commands[i][1]; j++){
	                arr.add(array[j-1]);
	            }
	            
	            Collections.sort(arr);
	            answer[i] = arr.get(commands[i][2]-1);
	        }
	        
	        return answer;
	    }
}
