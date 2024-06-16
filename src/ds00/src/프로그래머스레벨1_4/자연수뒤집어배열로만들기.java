package 프로그래머스레벨1_4;


public class 자연수뒤집어배열로만들기 {
	   
}

class Solution5 {
	public int[] solution(long n) {   
        String[] arr = Long.toString(n).split("");
        
        int[] answer = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            answer[i] = Integer.parseInt(arr[arr.length-1-i]);
        }
        
        return answer;
    }
}