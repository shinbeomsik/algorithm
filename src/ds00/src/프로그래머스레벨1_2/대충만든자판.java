package 프로그래머스레벨1_2;


public class 대충만든자판 {
	   
}

class Solution66 {
	 public int[] solution(String[] keymap, String[] targets) {
	        int[] answer = new int[targets.length];
	        int[] list = new int[26];
	        
	        for(int i=0; i < keymap.length; i++){
	            String keymapStr = keymap[i];
	            int count =1;
	            
	            for(int j=0; j<keymap[i].length(); j++){
	                int temp = keymapStr.charAt(j) - 'A';
	                if(list[temp] ==0 || list[temp] >= count){
	                    list[temp] = count;
	                }
	                count++;
	            }
	        }
	            
	            for(int i=0; i<targets.length; i++){
	                String targetsStr = targets[i];
	                int num =0;
	                
	                for(int k=0; k<targetsStr.length(); k++){
	                    int temp = targetsStr.charAt(k) - 'A';
	                    
	                    if(num != -1 && list[temp] !=0){
	                        num = num + list[temp];
	                    }else {
	                        num = -1;
	                        break;
	                    }
	                }
	                
	                answer[i] = num;
	            }
	        
	        return answer;
	    }
}