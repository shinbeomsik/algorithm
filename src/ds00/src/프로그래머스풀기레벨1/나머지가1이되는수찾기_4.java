
package 프로그래머스풀기레벨1;
import java.util.*;

public class 나머지가1이되는수찾기_4 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int n = 11;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution4 {
	public int solution(int n) {
        int answer = 0;
        int i=1;
        while (n%i != 1) {
            i++;
        }

    
        
        return answer +i;
    }
}