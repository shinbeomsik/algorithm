package 프로그래머스레벨1_2;


public class 둘만의암호 {
	   
}

class Solution63 {
	 public String solution(String s, String skip, int index) {
	        StringBuilder sb = new StringBuilder();

	        for (char ch : s.toCharArray()) {
	            int count = 0;
	            while (count < index) {
	                if (ch == 'z') {
	                    ch = 'a';
	                } else {
	                    ch++;
	                }
	                if (!skip.contains(String.valueOf(ch))) {
	                    count++;
	                }
	            }
	            sb.append(ch);
	        }
	        return sb.toString();
	    }
}