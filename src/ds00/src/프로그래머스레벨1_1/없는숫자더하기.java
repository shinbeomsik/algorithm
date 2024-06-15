package 프로그래머스레벨1_1;


public class 없는숫자더하기 {
}

class Solution17 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        for(int i=0;i<numbers.length;i++){
            arr[numbers[i]]++;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==0){
                answer += i;
            }
        }
        return answer;
    }
}