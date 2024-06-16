package 프로그래머스풀기레벨2_1;

import java.util.*;
public class 구명보트 {
	   
}

class Solution13 { // 가장 작은 무게와 가장큰 무게의 합이 limit가 넘어가면 어차피 가장큰 무게는 혼자 타야한다
	public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int min_index = 0;
        int max_index = people.length-1;
        
        while(max_index>= min_index){
            if(people[max_index] + people[min_index] <= limit){
                answer++;
                max_index--;
                min_index++;
            }else{
                answer++;
                max_index--;
            }
        }
    
        return answer;
    }
}