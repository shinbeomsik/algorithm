package 프로그래머스레벨1_4;

import java.util.*;
public class 모의고사 {
	   
}

class Solution50 {
	public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        //반복 되는 부분을 배열로 만들어줌
        int[] human1 = {1,2,3,4,5};  
        int[] human2 = {2,1,2,3,2,4,2,5};
        int[] human3 = {3,3,1,1,2,2,4,4,5,5};
        
        int count1 =0;
        int count2 =0;
        int count3 =0;
        
        //i를 answers의 길이로 나눔 (반복되는 부분이 있기때문에)
        for(int i=0; i<answers.length; i++){
            if(answers[i] == human1[i%5]){
                count1++;
            }
            if(answers[i] == human2[i%8]){
                count2++;
            }
            if(answers[i] == human3[i%10]){
                count3++;
            }
        }
        
        //다시 순서를할 list 배열을 만들어서 정렬해줌
        int[] list = new int[3];
        list[0] = count1;
        list[1] = count2;
        list[2] = count3;
        
        Arrays.sort(list);
        
        // 정렬을 해줘서 최대값이 count1부터 3까지 비교해서 같으면 answer에 추가
        if(list[2] == count1){
            answer.add(1);
        }
        if(list[2] == count2){
            answer.add(2);
        }
        if(list[2] == count3){
            answer.add(3);
        }
        
        return answer;
    }
}