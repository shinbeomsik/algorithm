package 프로그래머스레벨1_반복2;

import java.util.*;
public class 모의고사 {
	   
}

class Solution51 {
	  public  List<Integer> solution(int[] answers) {
	        List<Integer> answer = new ArrayList<>();
	        int[] supo1 = {1,2,3,4,5};
	        int[] supo2 = {2,1,2,3,2,4,2,5};
	        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
	        int count1 =0;
	        int count2 =0;
	        int count3 =0;
	        
	        for(int i=0; i < answers.length; i++){
	            if(answers[i] == supo1[i%5]){
	                count1++;
	            }
	            if(answers[i] == supo2[i%8]){
	                count2++;
	            }
	            if(answers[i] == supo3[i%10]){
	                count3++;
	            }
	        }
	        int[] arr = new int[3];
	        arr[0] = count1;
	        arr[1] = count2;
	        arr[2] = count3;
	        Arrays.sort(arr);
	        if(arr[2] == count1){
	            answer.add(1);
	        }
	        if(arr[2] == count2){
	            answer.add(2);
	        }
	        if(arr[2] == count3){
	            answer.add(3);
	        }
	        return answer;
	    }
}