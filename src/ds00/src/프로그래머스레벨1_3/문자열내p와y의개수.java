package 프로그래머스레벨1_3;


public class 문자열내p와y의개수 {
	   
}

class Solution8 {
	boolean solution(String s) {
        boolean answer = true;
        s  = s.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                pcount++;
            }else if(s.charAt(i)== 'y'){
                ycount++;
            }
        }
        if(pcount != ycount){
            answer = false;
        }
        return answer;
    }
}