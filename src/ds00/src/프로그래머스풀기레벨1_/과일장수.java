package 프로그래머스풀기레벨1_1회차반복;
import java.util.*;

public class 과일장수 {

	public static void main(String[] args) {
		Solution48 sol = new Solution48();
		int k =1; 
		int m =1;
		int[] score = {};

		int answer = sol.solution(k, m, score);
		System.out.println(answer);

	} 
}

class Solution48 {
	public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
      
        for(int i=0;i<score.length;i=i+m){
              List<Integer> arr = new ArrayList<>();
           if(i+m-1 < score.length){
            for(int j=i;j<i+m;j++){
               arr.add(score[score.length-1-j]);
             }
           }
            Collections.sort(arr);
            if(arr.size()==m){
                answer = answer + arr.get(0)*m;
            }
        }
        return answer;
    }
}

// 처리 속도 훨씬 빠르다

//public int solution(int k, int m, int[] score) {
//    int answer = 0;
//
//    Arrays.sort(score);
//
//    for(int i = score.length; i >= m; i -= m){
//        answer += score[i - m] * m;
//    }
//
//    return answer;
//}