package 프로그래머스레벨1_4;

import java.util.*;
public class 완주하지못한선수 {
	   
}

class Solution56 {
	public String solution(String[] participant, String[] completion) {
        String answer = " ";
        
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

/* 밑에부분이 chatGpt 부분인데 이러면 효율성이 크게 개선됨
 * public String solution(String[] participant, String[] completion) {
 * HashMap<String, Integer> participantMap = new HashMap<>();
 * 
 * // 참가자를 해시맵에 추가, 동명이인일 경우 카운트 증가 for (String p : participant) {
 * participantMap.put(p, participantMap.getOrDefault(p, 0) + 1); }
 * 
 * // 완주자를 해시맵에서 제거, 카운트 감소 for (String c : completion) { participantMap.put(c,
 * participantMap.get(c) - 1); }
 * 
 * // 값이 1인 참가자를 찾기 (완주하지 못한 사람) for (String key : participantMap.keySet()) { if
 * (participantMap.get(key) == 1) { return key; } }
 * 
 * return ""; // 이 부분은 사실상 도달하지 않음 } 
 */