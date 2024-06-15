package 프로그래머스풀기레벨2_반복;
import java.util.*;

public class 최대값과최솟값 {
	   
}

class Solution1 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] xrr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            xrr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(xrr);
        
        if(xrr[xrr.length-1] >0){
            int k=1;
             for(int i=xrr.length-2;i>=0;i--){
                 if(xrr[i] < 0){
                     k = xrr[i];
                 }
             }
            if(k !=1){
                answer = k + " " + xrr[xrr.length-1];
                return answer;
            }
            answer = xrr[0] + " " + xrr[xrr.length-1];
        }else{
            answer = xrr[0] + " " + xrr[xrr.length-1];
        }

        return answer;
    }
}