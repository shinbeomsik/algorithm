package 프로그래머스레벨1_반복4;

import java.util.Arrays;

public class 제일작은수제거하기 {
	   
}

class Solution21 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
            
            int[] arr2 = new int[arr.length];
            for(int i=0; i<arr2.length;i++){
                arr2[i] = arr[i];
            }
            
            Arrays.sort(arr2);
            
            int min = arr2[0];
            int count =0;
            
            for(int i=0;i<arr.length;i++){
                if(arr[i] != min){
                    answer[count] = arr[i];
                     count++;
                }
             
            }
            
            
        }
        return answer;
    }
}