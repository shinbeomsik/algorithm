package 프로그래머스레벨1_반복;


public class 옹알이2 {
	
}

class Solution41 {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0;i<babbling.length;i++){
            babbling[i] = babbling[i].replaceAll("ayaaya" , "x")
                                    .replaceAll("yeye" , "x")
                                    .replaceAll("woowoo" , "x")
                                    .replaceAll("mama" , "x")
                                    .replaceAll("aya" , " ")
                                    .replaceAll("ye", " ")
                                    .replaceAll("woo" , " ")
                                    .replaceAll("ma" , " ");
            
            if(babbling[i].trim().length() ==0){
                answer++;
            }

        }
                                                
        return answer;
    }
}