package 프로그래머스레벨1_1회차반복;


public class 자연수뒤집어배열로만들기 {
}

class Solution7 {
    public int[] solution(long n) {
        String k = Long.toString(n);
        String[] arr = k.split("");
        int[] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            answer[i] = Integer.parseInt(arr[arr.length-i-1]);
        }
        
        return answer;
    }
}