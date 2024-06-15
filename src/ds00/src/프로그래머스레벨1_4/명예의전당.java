package 프로그래머스레벨1_반복4;

import java.util.*;
public class 명예의전당 {
	   
}

class Solution46 {
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> arr = new ArrayList<>(); //새로운 배열을 만들려고 작성
        
        for(int i=0; i<answer.length; i++){
            arr.add(score[i]); // 점수를 무조건 추가
            Collections.sort(arr);
            if(arr.size() > k){ // 점수가 k개 이상이 될경우 정렬한후 0번 인덱스 제거 
                arr.remove(0);
            }
            answer[i] = arr.get(0);
        }
        return answer;
    }
}