package 프로그래머스풀기레벨2_반복;


public class 다음큰숫자 {
	   
}

class Solution8 {
	public int solution(int n) {
	    int answer = 0;
	    int oneCount = Integer.bitCount(n);

	    while (true) {
	        n++;
	        if (Integer.bitCount(n) == oneCount) {
	            break;
	        }
	    }

	    answer = n;
	    return answer;
	}
}


/* 이것도 되긴 하는데 효율성이 안나온다 !!! 정확성은 100프로 통과
 * public int solution(int n) { int answer = 0; boolean as = true; String k =
 * Integer.toBinaryString(n); k = k.replaceAll("0" , ""); int length1 =
 * k.length(); while(as){ n++; k = Integer.toBinaryString(n); k =
 * k.replaceAll("0" , ""); int re1length = k.length(); if(length1 == re1length){
 * as = false; } } answer = n; return answer; }
 */

/* 이것도 되긴하는데 효율성이 안나온다 !!! 정확성은 100프로 통과
 * public int solution(int n) { int answer = 0; String s =
 * Integer.toBinaryString(n); int slength = s.length(); s = s.replaceAll("1" ,
 * ""); slength = slength - s.length();
 * 
 * while(true){ n++;
 * 
 * String k = Integer.toBinaryString(n); int klength = k.length(); k =
 * k.replaceAll("1" , ""); klength = klength - k.length();
 * 
 * if(slength == klength){ break; } }
 * 
 * answer = n;
 * 
 * return answer; }
 */