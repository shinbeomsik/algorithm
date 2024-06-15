package 프로그래머스레벨1_반복4;


public class 문자열내P와Y의개수 {
	   
}

class Solution1 {
    boolean solution(String s) {
        boolean answer = false;

        s = s.toUpperCase();
        
        String[] arr = s.split("");
        int count =0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("P")){
                count++;
            }else if(arr[i].equals("Y")){
                count--;
            }
        }
        if(count ==0){
            answer = true;
        }
        
        return answer;
    }
}