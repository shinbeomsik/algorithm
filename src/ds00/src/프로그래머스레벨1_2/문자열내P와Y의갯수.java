package 프로그래머스레벨1_반복2;


public class 문자열내P와Y의갯수 {
	   
}

class Solution6 {
	boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int pcnt = 0;
        int ycnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='P'){
                pcnt++;
            }else if(s.charAt(i) == 'Y'){
                ycnt++;
            }
        }
        if(pcnt != ycnt){
            answer = false;
        }
        return answer;
    }
}