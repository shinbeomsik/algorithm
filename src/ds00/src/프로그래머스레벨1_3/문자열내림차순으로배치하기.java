package 프로그래머스레벨1_3;
import java.util.*;

public class 문자열내림차순으로배치하기 {
	   
}

class Solution19 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        answer = String.join("", arr);
        return answer;
    }
}