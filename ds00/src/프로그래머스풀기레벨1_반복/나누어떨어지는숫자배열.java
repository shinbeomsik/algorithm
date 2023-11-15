package 프로그래머스풀기레벨1_반복;

import java.util.*;

public class 나누어떨어지는숫자배열 {

}

class Solution16 {
    public List<Integer> solution(int[] arr, int divisor) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer.add(arr[i]);
            }
        }
        Collections.sort(answer);
        
        if(answer.size() ==0){
            answer.add(-1);
        }
        return answer;
    }
}