package 프로그래머스레벨1_반복2;
import java.util.*;

public class K번째수 {
	   
}

class Solution41 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            int[] arr = new int[commands[i][1] - commands[i][0] +1];
            int count =0;
            for(int j=commands[i][0]-1; j<commands[i][1];j++){
                arr[count] = array[j];
                count++;
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}