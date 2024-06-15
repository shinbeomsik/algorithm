package 프로그래머스레벨1_반복;

import java.util.*;

public class 문자열내마으대로정렬하기 {
	
}

class Solution55 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        String[] arr = new String[strings.length];
        for(int i=0;i<strings.length;i++){
            arr[i] = strings[i].substring(n,n+1) + strings[i];
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            answer[i] = arr[i].substring(1);
        }
        
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        
        return answer;
    }
}