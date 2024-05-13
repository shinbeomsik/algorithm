package 프로그래머스레벨1_반복4;

import java.util.Arrays;
public class 문자열내림차순으로배치하기 {
	   
}

class Solution24 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        String[] arr2 = new String[arr.length];    
        Arrays.sort(arr);
    
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[arr.length-1-i];
        }
        answer = String.join("",arr2);
        return answer;
    }
}