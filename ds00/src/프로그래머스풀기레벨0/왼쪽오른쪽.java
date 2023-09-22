package 프로그래머스풀기레벨0;


import java.util.*;
public class 왼쪽오른쪽 {

	public static void main(String[] args) {
		Solution132 sol = new Solution132();
		String[] str_list = {"0","3" ,"r" ,"l"};

		List<String> answer = sol.solution(str_list);
		System.out.println(answer);

	}
}  

class Solution132 {
	public List<String> solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        
        int a = 0;
        int b = 0;
        
        for(int i=0; i<str_list.length;i++) {
        	if(str_list[i].equals("l")) {
        		a = i;
        		break;
        	}else if(str_list[i].equals("r")) {
        		b = i;
        		break;
        	}
        }
        
        if(a>b) {
        	for(int i=0;i<a;i++) {
        		answer.add(str_list[i]);
        	}
        }else if(a<b) {
        	for(int i=b+1;i<str_list.length;i++) {
        		answer.add(str_list[i]);
        	}
        }else if(str_list[0].equals("r")) {
        	for(int i=1; i<str_list.length;i++) {
        		answer.add(str_list[i]);
        	}
        }
        
        return answer;
    }
}