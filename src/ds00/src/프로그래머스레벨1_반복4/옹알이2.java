package 프로그래머스레벨1_반복4;


public class 옹알이2 {
	   
}

class Solution53 {
	public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length;i++){ //옹알이가 반복되면 x로 둠 반복되는걸 먼저 체크
            babbling[i] = babbling[i].replaceAll("ayaaya","x")
                .replaceAll("yeye","x")
                .replaceAll("woowoo","x")
                .replaceAll("mama","x");
            
            babbling[i] = babbling[i].replaceAll("aya"," ") // 반복되지 않은 옹알이 체크
                .replaceAll("ye"," ")
                .replaceAll("woo"," ")
                .replaceAll("ma"," ");
                
            if(babbling[i].trim().length() ==0){ // 옹알이만 한다면 길이가 0이됨
                answer++;
            }
        }
        return answer;
    }
}