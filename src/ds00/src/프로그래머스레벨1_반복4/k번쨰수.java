package 프로그래머스레벨1_반복4;

import java.util.*;
public class k번쨰수 {
	   
}

class Solution42 {
	  public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        for(int i=0; i<commands.length; i++){
	            ArrayList<Integer> arr = new ArrayList<>();
	            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
	                arr.add(array[j]);
	            }
	            Collections.sort(arr);
	            answer[i] = arr.get(commands[i][2]-1);
	        }
	        return answer;
	    }
}