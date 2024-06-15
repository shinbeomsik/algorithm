package 프로그래머스레벨1_반복4;


public class 로또의최고순위와최저순위 {
	   
}

class Solution54 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min =0; // 최소 몇개 맞췄는지
        int zero =0; // 0 의 갯수가 몇개인기
        for(int i=0; i<lottos.length;i++){
            if(lottos[i] == 0){ 
                zero++;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    min++;
                    break; // 점수가 같은걸 확인했으니 더이상 비교 안해도됨
                }
            }
        }
        
       if(min >0){
           answer[1] = 7-min ;
           answer[0] = 7-min - zero;
       }else if(zero == 6){
           answer[0] = 1;
           answer[1] = 6;
       }else{
           answer[0] = 6;
           answer[1] = 6;
       }
        return answer;
    }
}