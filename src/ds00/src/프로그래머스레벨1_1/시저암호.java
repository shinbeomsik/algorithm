package 프로그래머스레벨1_반복;


public class 시저암호 {
	
}

class Solution68 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            int k = 0;
            if(arr[i] != ' '){
               if( (int)arr[i] >= 65 && (int)arr[i] <= 90 ){
                   if(arr[i] + n > 90){
                       k = arr[i] + n - 26;
                   }else{
                       k = arr[i] + n;
                   }
               }else{
                   if(arr[i] + n> 122){
                       k = arr[i] + n -26;
                   }else{
                       k = arr[i] + n;
                   }
               }
            }else{
                continue;
            }
            arr[i] = (char)k;    
        }
        
        answer = new String(arr);
        return answer;
    }
}