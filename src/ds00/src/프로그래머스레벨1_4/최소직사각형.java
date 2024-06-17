package 프로그래머스레벨1_4;
import java.util.Arrays;

public class 최소직사각형 {
	   
}

class Solution36 {
public int solution(int[][] sizes) {
        
        int answer = 0;

        int[] maxw = new int[sizes.length];
        int[] maxh = new int[sizes.length];

        for(int i=0; i<sizes.length; i++){   
            Arrays.sort(sizes[i]);
            maxw[i] = sizes[i][0];
            maxh[i] = sizes[i][1];
        }
        Arrays.sort(maxw);
        Arrays.sort(maxh);
        
        answer = maxh[maxh.length-1] * maxw[maxw.length-1];
        return answer;
    }
}