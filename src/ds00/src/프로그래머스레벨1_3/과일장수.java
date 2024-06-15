package 프로그래머스레벨1_3;

import java.util.*;
public class 과일장수 {
	   
}

class Solution59 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;        
        Arrays.sort(score);
        for(int i=score.length-m; 0<=i;i = i-m){
                answer = answer + score[i]*m;
        }
        return answer;
    }
}