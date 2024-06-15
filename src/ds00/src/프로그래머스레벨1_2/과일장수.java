package 프로그래머스레벨1_2;

import java.util.*;
public class 과일장수 {
	   
}

class Solution50 {
	 public int solution(int k, int m, int[] score) {
	        int answer = 0;
	        Arrays.sort(score);
	        for(int i=score.length-m;i>=0;i=i-m){
	            answer = answer + score[i] *m;
	        }
	        return answer;
	    }
}