package 프로그래머스레벨1_1;


public class 기사단원의무기 {
	
}

class Solution40 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] arr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                arr[j]++;
            }
        }
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= limit){
                answer = answer + arr[i];
            }else{
                answer = answer  + power;
            }
        }
        
        return answer;
    }
}

/* 이거는 가능하긴 하지만 시간 초과가 뜬다 시간 초과를 줄일 방법을 찾아야함
 * class Solution { public int solution(int number, int limit, int power) { int
 * answer = 0;
 * 
 * for(int i =1;i<=number;i++){ int count =0; for(int j=1;j<=i;j++){ if(i%j==0){
 * count++; } }
 * 
 * if(count <= limit){ answer = answer + count; }else{ answer = answer + power;
 * } }
 * 
 * return answer; } }
 */