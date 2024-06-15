package 프로그래머스레벨1_2;
import java.util.*;

public class 최소직사각형 {
	   
}

class Solution37 {
	public int solution(int[][] sizes) {
        int answer = 0;
        int[] arr = new int[sizes.length];
        int[] brr = new int[sizes.length];
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0] > sizes[i][1]){
                arr[i] = sizes[i][0];
                brr[i] = sizes[i][1];
            }else{
                arr[i] = sizes[i][1];
                brr[i] = sizes[i][0];
            }
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        answer = arr[arr.length-1] * brr[brr.length-1];
        return answer;
    }
}