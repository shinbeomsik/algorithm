package 프로그래머스풀기레벨1_반복;



public class 내적 {

}

class Solution22 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0;i<a.length;i++){
            answer = answer +  a[i]*b[i];
        }
        return answer;
    }
}