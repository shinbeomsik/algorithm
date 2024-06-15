package 프로그래머스레벨1_2;
import java.util.*;

public class 정수내림차순으로배치하기 {
	   
}

class Solution11 {
	public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] arr = s.split("");
        Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        s = String.join("",arr);
        answer = Long.parseLong(s);
        return answer;
    }
}