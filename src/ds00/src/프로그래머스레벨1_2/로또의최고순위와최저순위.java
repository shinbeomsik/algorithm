package 프로그래머스레벨1_2;


public class 로또의최고순위와최저순위 {
	   
}

class Solution57 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero  =0;
        int atari =0;
        for(int i=0;i<lottos.length;i++){
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i] == win_nums[j]){
                    atari++;
                }
            }
            if(lottos[i] == 0){
                zero++;
            }
        }
        
        if(atari == 6){
            answer[1] = 1;
        }else if(atari == 5){
            answer[1] = 2;
        }else if(atari == 4){
            answer[1] = 3;
        }else if(atari == 3){
            answer[1] = 4;
        }else if(atari == 2){
            answer[1] = 5;
        }else{
            answer[1] = 6;
        }
        
        if(atari+zero == 6){
            answer[0] = 1;
        }else if(atari+zero == 5){
            answer[0] = 2;
        }else if(atari+zero == 4){
            answer[0] = 3;
        }else if(atari+zero == 3){
            answer[0] = 4;
        }else if(atari+zero == 2){
            answer[0] = 5;
        }else{
            answer[0] = 6;
        }
        return answer;
    }
}