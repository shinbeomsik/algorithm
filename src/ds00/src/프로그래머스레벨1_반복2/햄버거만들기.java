package 프로그래머스레벨1_반복2;

import java.util.*;

public class 햄버거만들기 {
	   
}

class Solution61 {
	public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<ingredient.length; i++){
            arr.add(ingredient[i]);
            if(arr.size()>=4){
                if(arr.get(arr.size()-4) == 1 && arr.get(arr.size()-3) == 2 &&
                   arr.get(arr.size()-2) == 3 && arr.get(arr.size()-1) == 1){
                    answer++;
                    arr.remove(arr.size()-4);
                    arr.remove(arr.size()-3);
                    arr.remove(arr.size()-2);
                    arr.remove(arr.size()-1);
                }
            }
        }
        
        return answer;
    }
}