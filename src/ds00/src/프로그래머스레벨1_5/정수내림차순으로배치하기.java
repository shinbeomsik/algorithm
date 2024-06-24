package 프로그래머스레벨1_5;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
			  
}

class Solution6 {
	public long solution(long n) {
        long answer = 0;
        
        String k = Long.toString(n);
        
        String[] arr = k.split("");
        
        Arrays.sort(arr);
        
        String[] brr = new String[arr.length];
        
        for(int i=0; i<arr.length; i++){
            brr[i] = arr[arr.length-1-i];
        }
        
        k = String.join("",brr);
        answer = Long.parseLong(k);
        return answer;
    }
}