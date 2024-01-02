package 프로그래머스레벨1_반복2;

import java.util.*;
public class a3진법뒤집기 {
	   
}

class Solution32 {
	public double solution(int n) {
        double answer = 0;
        List<Integer> arr = new ArrayList<>();
        
        while(n !=0){
            arr.add(n%3);
            n = n/3;
        }
        
         for(int i=0;i<arr.size();i++){
            answer = answer + arr.get(arr.size()-1-i) * Math.pow(3,i);
        }
        
        return answer;
    }
}