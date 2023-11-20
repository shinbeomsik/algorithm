package 프로그래머스레벨1_1회차반복;


public class 자릿수더하기 {
}

class Solution9 {
    public int solution(int n) {
        int answer = 0;
        
        String k = Integer.toString(n);
        String[] arr = k.split("");
        for(int i=0;i<arr.length;i++){
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}