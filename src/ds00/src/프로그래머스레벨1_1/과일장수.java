package 프로그래머스레벨1_1;

import java.util.*;
public class 과일장수 {
	
}

class Solution47 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(score);
        for(int i=score.length-1;i>=0;i--){

            arr.add(score[i]);
            if(arr.size() == m){
                answer = answer + arr.get(arr.size()-1) * m ;
                arr.clear();
            }
        }

        return answer;
    }
}