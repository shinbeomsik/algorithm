package 프로그래머스레벨1_반복4;
import java.util.*;

public class 두개뽑아서더하기 {
	   
}

class Solution39 {
	   public int[] solution(int[] numbers) {
	        int[] answer = {};
	        
	        ArrayList<Integer> arr = new ArrayList<>();
	        ArrayList<Integer> brr = new ArrayList<>();
	        
	        for(int i=0;i<numbers.length-1;i++){
	            for(int j= i+1; j<numbers.length;j++){
	                arr.add(numbers[i] + numbers[j]);
	            }
	        }
	        
	        for(int i :arr){
	            if(!brr.contains(i)){
	                brr.add(i);
	            }
	        }
	        
	        answer = new int[brr.size()];
	        for(int i=0;i<answer.length;i++){
	            answer[i] = brr.get(i);
	        }
	        
	        Arrays.sort(answer);
	   
	        return answer;
	    }
}