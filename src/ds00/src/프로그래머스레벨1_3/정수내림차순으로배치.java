package 프로그래머스레벨1_3;

import java.util.*;
public class 정수내림차순으로배치 {
	   
}

class Solution34 {
	public long solution(long n) {
        long answer = 0;
        String k = Long.toString(n);
        String[] arr = k.split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        k = String.join("",arr);
        answer = Long.parseLong(k);
        return answer;
    }
}