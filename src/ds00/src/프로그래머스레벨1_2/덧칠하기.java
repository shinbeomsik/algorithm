package 프로그래머스레벨1_반복2;

public class 덧칠하기 {
	   
}

class Solution55 {
	public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n+1];
        for(int i=0;i<section.length;i++){
            wall[section[i]]--;
        }
        for(int i=1;i<wall.length;i++){
            if(wall[i] == -1){
                if(i+m <= wall.length){
                    for(int j=i;j<i+m;j++){
                        wall[j]++;
                    }
                    answer++;
                }else{
                    for(int j=i;j<wall.length;j++){
                        wall[j]++;
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}