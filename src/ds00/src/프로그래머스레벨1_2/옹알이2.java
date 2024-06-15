package 프로그래머스레벨1_반복2;


public class 옹알이2 {
	   
}

class Solution56 {
	public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            babbling[i] = babbling[i]
                .replaceAll("ayaaya","x")
                .replaceAll("aya"," ")
                .replaceAll("yeye","x")
                .replaceAll("ye"," ")
                .replaceAll("woowoo","x")
                .replaceAll("woo"," ")
                .replaceAll("mama","x")
                .replaceAll("ma"," ");    
        
            if(babbling[i].trim().length()==0){
                answer++;
            }
        }
        return answer;
    }
}