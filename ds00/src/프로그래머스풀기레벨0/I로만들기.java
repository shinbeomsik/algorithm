
package 프로그래머스풀기레벨0;

import java.util.*;

public class I로만들기 {

	public static void main(String[] args) {
		Solution58 sol = new Solution58();
		String myString = "jjnnllkkmm";

		String answer = sol.solution(myString);
		System.out.println(answer);

	}
}

//	compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이다.

//	compareTo() 함수에는 위에서 설명하는바와 같이 "문자열의 비교" 와 "숫자의 비교" 두 방식이 존재한다.

//	숫자의 비교 같은 경우는 단순히 크다(1), 같다(0), 작다(-1) 의 관한 결과값을 리턴해주는 반면
//	문자열의 비교 같은 경우는 밑에 처럼 반환된다
//	기준 값과 비교대상이 동일한 값일 경우 0
//	기준 값이 비교대상 보다 작은 경우 -1
//	기준 값이 비교대상 보다 큰 경우 1

//  비교가 불가능한 지점의 각 문자열의 아스키값을 기준으로 비교를 해준다.
//	"abcd" 와 "c" 를 비교해줄 경우 첫번째 위치에서 비교가 실패했기 때문에,
//	"a" 와 "c"의 아스키코드 값의 차이값을 리턴해준다

class Solution58 {
	public String solution(String myString) {
	        String answer = "";
	        String[] arr = myString.split("");
	        
	        for(int k=0; k<arr.length;k++) {
	        	if(arr[k].compareTo("l") < 0) {
	        		arr[k] = "l";
	        	}
	        }
	        
	        answer = String.join("", arr);
	        
	        System.out.println(answer);
	        return answer;
	    }
}