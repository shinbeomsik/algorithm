package 프로그래머스풀기레벨2_반복;


public class 점프와순간이동 {
	   
}

class Solution12 { //도착지점에서 반대로 돌아온다고 생각!  짝수면 계속 순간이동해서 갈수 있기 때문에
	public int solution(int n) {
        int ans = 0;
        
        while(n !=1){
            if(n%2 ==1){
                ans++;
            }
            
            n = n/2;
        }
        ans++;
        return ans;
    }
}