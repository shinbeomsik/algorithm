package 프로그래머스레벨1_3;

import java.util.*;
public class 제일작은수제거하기 {
	   
}

class Solution35 {
	public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        if(arr.length ==1){
            answer.add(-1);
        }else{
            for(int i=0;i<arr.length;i++){
                answer.add(arr[i]);
            }
            Arrays.sort(arr);
            answer.remove(Integer.valueOf(arr[0]));
        }
        return answer;
    }
}