package 프로그래머스레벨1_반복2;


public class 문자열나누기 {
	   
}

class Solution62 {
	public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        
        int first =0;
        int last = 0;
        String k = arr[0];
        
        for(int i=0; i<arr.length-1; i++){
        
            if(k.equals(arr[i])){
                first++;
            }else{
                last++;
            }
            
            if(first == last){
                answer++;
                k = arr[i+1];
                first =0;
                last=0;
            }
        }
        answer++;
        return answer;
    }
}