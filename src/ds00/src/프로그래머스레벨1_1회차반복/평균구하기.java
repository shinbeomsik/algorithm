package 프로그래머스레벨1_1회차반복;


public class 평균구하기 {
}

class Solution3 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        answer = (double)sum/arr.length;
        return answer;
    }
}