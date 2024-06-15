package 프로그래머스레벨1_2;

import java.util.*;
public class 명예의전당 {
	   
}

class Solution47 {
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<score.length;i++){
            arr.add(score[i]);
             Collections.sort(arr);
            if(arr.size()>k){
                arr.remove(0);
            }
            answer[i] = arr.get(0);
        }
        return answer;
    }
}