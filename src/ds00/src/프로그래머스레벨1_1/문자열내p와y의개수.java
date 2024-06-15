package 프로그래머스레벨1_1;

public class 문자열내p와y의개수 {
}

class Solution8 {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toUpperCase();
        String[] arr = s.split("");
        int yc = 0;
        int pc = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("P")){
                pc++;
            }else if(arr[i].equals("Y")){
                yc++;
            }
        }
        
        if(pc != yc){
            answer = false;
        }

        return answer;
    }
}