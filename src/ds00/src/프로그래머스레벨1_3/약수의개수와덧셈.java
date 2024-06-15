package 프로그래머스레벨1_3;


public class 약수의개수와덧셈 {
	   
}

class Solution36 {
	public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int count = 0;
            for(int j=1;j<=i;j++ ){
                if(i%j==0){
                    count++;
                }
            }
            if(count %2 ==0){
                answer = answer + i;
            }else{
                answer = answer - i;
            }
        }
        return answer;
    }
}