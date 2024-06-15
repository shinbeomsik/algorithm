package 프로그래머스레벨1_1;
import java.util.*;

public class 명예의전당1 {
	
}

class Solution43 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> arr = new ArrayList<>();
       if(k<=score.length){ 
            for(int i=0;i<k;i++){
                arr.add(score[i]);
                Collections.sort(arr);
                answer[i] = arr.get(0);
            }
        
            for(int i=k; i<score.length;i++){
                arr.add(score[i]);
                Collections.sort(arr);
                arr.remove(0);
                answer[i] = arr.get(0);
            }
       }else{
           for(int i=0;i<score.length;i++){
               arr.add(score[i]);
               Collections.sort(arr);
               answer[i] = arr.get(0);
           }
       }
        return answer;
    }
}