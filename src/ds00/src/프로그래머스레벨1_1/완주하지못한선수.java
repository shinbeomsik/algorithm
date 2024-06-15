package 프로그래머스레벨1_1;

import java.util.*;

public class 완주하지못한선수 {
	
}

class Solution45 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        if(participant.length>1){
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
            answer =  participant[participant.length-1];
        }
        }else{
            answer = participant[0];
        }
        return answer;
    }
}