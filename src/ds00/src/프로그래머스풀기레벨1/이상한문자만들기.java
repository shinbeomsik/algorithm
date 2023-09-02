
package 프로그래머스풀기레벨1;

import java.util.Arrays;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		String s = "try hello world";

		String answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution25 {
	public String solution(String s) {
        String answer = "";
        String[] k = s.split(" ",-1);
        for(int i=0;i<k.length;i++) {
        	String[] kk = k[i].split("");
        	for(int t=0;t<kk.length;t++) {
        		if(t%2==0) {
        			kk[t] =kk[t].toUpperCase();
        		}else {
        			kk[t] =kk[t].toLowerCase();
        		}
        	}
        	k[i] = String.join("",kk);
        }
        answer = String.join(" ",k);
        return answer ;
    }
}