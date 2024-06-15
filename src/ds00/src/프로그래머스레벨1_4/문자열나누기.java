package 프로그래머스레벨1_반복4;


public class 문자열나누기 {
	   
}

class Solution55 {
	public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split("");
        
        String k= arr[0];
        
        int count =0; // K와 같다면 증가 
        int notcount =0; // K와 같지 않다면 증가
        
        
        for(int i=0; i<arr.length-1; i++){
            if(k.equals(arr[i])){
                count++;
            }else{
                notcount++;
            }
            
            if(count == notcount){
                answer++;
                k = arr[i+1]; // 갯수가 똑같아 진다면 K 새로 정의
                count = 0;
                notcount =0;
            }
        }
        answer++; // 마지막 인덱스가 남아있기 때문에 무조건 답에 1을 추가
        return answer;
    }
}