package 프로그래머스레벨1_반복2;

import java.util.*;
public class 예산 {
	   
}

class Solution33 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int total = 0;
        for(int i=0;i<d.length;i++){
            total = total + d[i];
            if(total> budget){
                break;
            }
            answer++;
        }
        return answer;
    }
}