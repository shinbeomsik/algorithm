package 프로그래머스레벨1_4;


public class 카드뭉치 {
	   
}

class Solution47 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int count1 =0;
        int count2 =0;
        
        for(int i=0; i<goal.length; i++){
            if(count1 < cards1.length && goal[i].equals(cards1[count1])){
                count1++;
            }else if(count2 < cards2.length && goal[i].equals(cards2[count2])){
                count2++;
            }
        }
        
        if(count1 + count2 < goal.length){
            answer = "No";
        }
        return answer;
    }
}