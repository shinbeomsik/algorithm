package 프로그래머스레벨1_1;
import java.util.*;

public class 최소직사각형 {
	
}

class Solution51 {
    public int solution(int[][] sizes) {
        int answer = 0; 
        int maxW =0;
        int maxH =0;
        for(int i=0;i<sizes.length;i++){
            Arrays.sort(sizes[i]);
            if(sizes[i][0] > maxW){
                maxW = sizes[i][0];
            }
            if(sizes[i][1] > maxH){
                maxH = sizes[i][1];
            }
        }
        answer = maxW * maxH;
        return answer;
    }
}