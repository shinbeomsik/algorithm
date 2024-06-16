package 프로그래머스레벨1_4;

import java.util.*;
public class 문자열다루기기본 {
	   
}

class Solution26 {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6){
            String[] arr = s.split("");
            Arrays.sort(arr);
            if(arr[arr.length-1].equals("0")){
                answer = true;
            }else if(arr[arr.length-1].equals("1")){
                answer = true;
            }else if(arr[arr.length-1].equals("2")){
                answer = true;
            }else if(arr[arr.length-1].equals("3")){
                answer = true;
            }else if(arr[arr.length-1].equals("4")){
                answer = true;
            }else if(arr[arr.length-1].equals("5")){
                answer = true;
            }else if(arr[arr.length-1].equals("6")){
                answer = true;
            }else if(arr[arr.length-1].equals("7")){
                answer = true;
            }else if(arr[arr.length-1].equals("8")){
                answer = true;
            }else if(arr[arr.length-1].equals("9")){
                answer = true;
            }
        }
        
        return answer;
    }
}