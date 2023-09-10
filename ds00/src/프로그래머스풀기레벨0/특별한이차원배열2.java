
package 프로그래머스풀기레벨0;

public class 특별한이차원배열2 {

	public static void main(String[] args) {
		Solution68 sol = new Solution68();
		int[][] arr = {{19, 498, 258, 587},{19, 498, 258, 587},
				{258, 7, 1000, 723},{587, 754, 723, 81}};

		int answer = sol.solution(arr);
		System.out.println(answer);

	}
}  

class Solution68 {
	 public int solution(int[][] arr) {
	        int answer = 0;
	        for(int i=0; i<arr.length; i++) {
	        	for(int j=0; j<arr.length; j++) {
	        		if(arr[i][j] == arr[j][i]) {
	        			answer = 1;
	        		}else if(arr[i][j] != arr[j][i]) {
	        			answer = 0;
	        			break;
	        		}
	        	}
	        }
	        return answer;
	    }
}
	 
	// public int solution(int[][] arr) {   	 위에 코드로 풀면 정답은 되는데 테스트코드2는 안된다
	//        int answer = 1;               	 break를 해도 내부는 끝나도 바깥에서 계속 돌기 때문
	//        for(int i=0; i<arr.length; i++) {  그래서 차라리 처음에 answer =1을 주고 
	//       	for(int j=0; j<arr.length; j++) {똑같은게 나오지 않는다면 answer=0을주고 리턴하게 만들었다
	//        		if(arr[i][j] != arr[j][i]) { 이러니까 테스트코드 2도 잘 통과된다 
	//        			answer = 0;
    //        		}
	//       	}
	//       }
	//      return answer;
	//  }
