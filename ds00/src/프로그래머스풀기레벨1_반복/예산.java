package 프로그래머스풀기레벨1_반복;


import java.util.*;

public class 예산 {

}

class Solution29 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            if(budget<d[i]){
                break;
            }
            
            budget = budget - d[i];
            answer++;
        }
        return answer;
    }
}