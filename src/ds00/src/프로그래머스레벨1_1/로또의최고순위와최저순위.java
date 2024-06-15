package 프로그래머스레벨1_1;


public class 로또의최고순위와최저순위 {
	
}

class Solution62 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int atari =0;
        int count0 =0;
        for(int i=0;i<lottos.length;i++){
            for(int j=0; j<win_nums.length;j++){
                if(lottos[i] == win_nums[j]){
                   atari++;
                    break;
                }
            }
            
            if(lottos[i] == 0){
                count0++;
            }
        }
            if(atari == 0 || atari ==1){
                answer[1] = 6;
                if(atari + count0 ==0 || atari + count0 ==1){
                    answer[0] = 6;
                }else{
                    answer[0] = 7-atari-count0; 
                }
            }else {
                answer[1] = 7-atari;
                answer[0] = 7-atari-count0;
            }
        
        return answer;
    }
}