package 프로그래머스레벨1_4;


public class a3진법뒤집기 {
	   
}

class Solution31 {
	public int solution(int n) {
        int answer = 0;
        String k = "";
        while(n != 0){
            k =  k + Integer.toString(n%3);
            n = n/3;
        }
        
        String[] arr = k.split("");
        int s3 = 1;
        for(int i=0; i<arr.length; i++){
            answer = answer + Integer.parseInt(arr[arr.length-1-i]) * s3 ;
            
            s3 = s3 * 3;
            
        }
 
        return answer;
    }
}