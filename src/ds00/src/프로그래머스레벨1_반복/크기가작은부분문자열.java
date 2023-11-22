package 프로그래머스레벨1_반복;


public class 크기가작은부분문자열 {
}

class Solution32 {
    public int solution(String t, String p) {
        int answer = 0;
        Long r = Long.parseLong(p);
        for(int i=0;i <= (t.length()-p.length());i++){
            String k  = t.substring(i,i+p.length());
            Long s = Long.parseLong(k);
            if(s<=r){
                answer++;
            }
        }
        return answer;
    }
}