package 프로그래머스레벨1_2;
import java.util.*;

public class 완주하지못한선수 {
	   
}

class Solution60 {
	 public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        if(participant.length==1){
	            answer = participant[0];
	            return answer;
	        }
	        for(int i=0;i<participant.length;i++){
	            if(!participant[i].equals(completion[i])){
	                answer = participant[i];
	                break;
	            }
	        }
	        return answer;
	    }
}