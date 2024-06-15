package 프로그래머스레벨1_3;

import java.util.*;
public class 모의고사 {
	   
}

class Solution58 {
	public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] role1 = {1,2,3,4,5};
        int[] role2 = {2,1,2,3,2,4,2,5};
        int[] role3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] total = new int[4];
        int[] total2 = new int[4];
        
        for(int i=0; i<answers.length;i++){
            if(answers[i] == role1[i%5]){
                total[1]++;
                total2[1]++;
            }
            
            if(answers[i] == role2[i%8]){
                total[2]++;
                total2[2]++;
            }
            
            if(answers[i] == role3[i%10]){
                total[3]++;
                total2[3]++;
            }
        }
        
        Arrays.sort(total);
        
        for(int i=1;i<total.length;i++){
            if(total[3] ==total2[i]){
                answer.add(i);
            }
        }

        return answer;
    }
}