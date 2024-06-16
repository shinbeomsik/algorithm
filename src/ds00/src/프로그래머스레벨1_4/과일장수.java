package 프로그래머스레벨1_4;

import java.util.*;
public class 과일장수 {
	   
}

class Solution51 {
	public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score); //먼저 점수를 정렬
        
        for(int i=score.length-1; i>=0; i= i-m){ // m개 만큼 상자에 담는다
            List<Integer> arr = new ArrayList<>(); // m만큼 담을 배열을 생성
            for(int j=0; j<m; j++ ){
               if(i-j >= 0){  // i 가 j 보다 작으면 마이너스가 되므로 클때만 배열에 넣음
                arr.add(score[i-j]); 
               }
            }
            
            if(arr.size() == m){ // 사이즈가 m개씩이면 가격책정
                answer = answer + arr.get(m-1)*m;
            }
        }
        
        return answer;
    }
}