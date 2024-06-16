package 프로그래머스풀기레벨2_1;

import java.util.*;
public class 짝지어제거하기 {
	   
}

class Solution10 {
	public int solution(String s){
        int answer = 0;
        if(s.length() ==0){
            return answer;
        }
        List<Character> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr.add(s.charAt(i));
            if(arr.size()>=2){
                if(arr.get(arr.size()-1) == arr.get(arr.size()-2)){
                    arr.remove(arr.size()-2);
                    arr.remove(arr.size()-1);
                }
            }
        }
        if(arr.size()==0){
            answer =1;
        }
        return answer;
    }
}