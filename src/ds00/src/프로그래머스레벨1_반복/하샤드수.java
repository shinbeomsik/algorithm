package 프로그래머스레벨1_반복;


public class 하샤드수 {
}

class Solution11 {
    public boolean solution(int x) {
        boolean answer = true;
        String k = Integer.toString(x);
        String[] arr = k.split("");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += Integer.parseInt(arr[i]);
        }
        if(x%sum !=0){
            answer =false;
        }
        return answer;
    }
}