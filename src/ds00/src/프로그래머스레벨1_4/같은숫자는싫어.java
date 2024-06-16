package 프로그래머스레벨1_4;

import java.util.*;
public class 같은숫자는싫어 {
	   
}

class Solution29 {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> krr = new ArrayList<>();
        
        krr.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                krr.add(arr[i]);
            }
        }
        
        answer = new int[krr.size()];
        for(int i=0;i<krr.size();i++){
            answer[i] = krr.get(i);
        }

        return answer;
    }
}