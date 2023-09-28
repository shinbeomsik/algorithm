
package 프로그래머스풀기레벨1;

import java.util.*;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		int[] numbers = {0,0,100,100 ,0 ,1,1,1,1,1,1,1};

		List<Integer> answer = sol.solution(numbers);
		System.out.println(answer);

	} 
}
//    arr 리스트는 Integer 객체를 저장하고 있으므로, 
//   .intValue() 메서드를 사용하여 객체에서 정수 값을 추출한 다음, 두 정수 값을 비교.
class Solution36 {
	public List<Integer> solution(int[] numbers) {
		List<Integer> arr = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
			arr.add(numbers[i] + numbers[j]);
			}
		}
		Collections.sort(arr);
		answer.add(arr.get(0));
		for(int i=0;i<arr.size()-1;i++) {
			if(arr.get(i).intValue() != arr.get(i+1).intValue()) {
				answer.add((int)arr.get(i+1));
			}
		}
		
        return answer;
    }
}