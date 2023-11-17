package 프로그래머스풀기레벨1_반복;

import java.util.*;

public class 문자열내림차순으로배치하기 {

}

class Solution23 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        Arrays.sort(arr);
        String[] brr = new String[arr.length];
        
        for(int i=0;i<arr.length;i++){
            brr[i] = arr[arr.length-1-i];
        }
        answer = String.join("",brr);
        return answer;
    }
}