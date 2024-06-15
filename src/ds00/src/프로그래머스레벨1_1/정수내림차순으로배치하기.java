package 프로그래머스레벨1_1;

import java.util.*;
public class 정수내림차순으로배치하기 {
}

class Solution10 {
    public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        String[] arr = a.split("");
        Arrays.sort(arr);
        String[] brr = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i] = arr[arr.length-1-i];
        }
        
        a = String.join("",brr);
        answer = Long.parseLong(a);
        return answer;
    }
}