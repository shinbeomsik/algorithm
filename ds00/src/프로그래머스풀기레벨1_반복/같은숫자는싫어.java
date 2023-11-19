package 프로그래머스풀기레벨1_반복;

import java.util.*;

public class 같은숫자는싫어 {

}

class Solution27 {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}