package 프로그래머스풀기레벨1_반복;

import java.util.*;

public class 제일작은수제거하기 {

}

class Solution19 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        if(arr.length ==1){
            answer.add(-1);
            return answer;
        }
        int[] brr = new int[arr.length];
        
        for(int k=0;k<brr.length;k++){
            brr[k] = arr[k];
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<brr.length;i++){
            if(brr[i]==arr[0]){
                
            }else{
                answer.add(brr[i]);
            }
        }
        
        return answer;
    }
}