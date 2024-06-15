package 프로그래머스레벨1_반복;


public class 푸드파이트대회 {
}

class Solution37 {
	public String solution(int[] food) {
        String answer = "";
        
        for(int i=1 ; i<food.length;i++){
            int k = food[i]/2;
            for(int q=0 ; q<k;q++){
                answer = answer + i;
            }
        }
        String[] arr = answer.split("");
        answer = answer + "0";
        for(int i=0;i<arr.length;i++){
            answer = answer + arr[arr.length-1-i];
        }
        return answer;
    }
}