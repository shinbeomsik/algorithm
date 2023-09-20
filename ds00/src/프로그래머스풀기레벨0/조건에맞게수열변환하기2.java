package 프로그래머스풀기레벨0;
import java.util.*;

public class 조건에맞게수열변환하기2 {

	public static void main(String[] args) {
		Solution121 sol = new Solution121();
		int[] arr = {1, 2, 3, 100, 99, 98};

		int answer = sol.solution(arr);
		System.out.println(answer);

	}
}  

class Solution121 {
	public int solution(int[] arr) {
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            arr1[i]=arr[i];
        }

        int answer=-1;
        int cnt = 0;

        while(cnt!=arr.length) {
            cnt = 0;

            for(int i = 0; i<arr1.length;i++) {

                if((arr1[i]>=50)&&(arr1[i]%2==0)) {
                    arr1[i]/=2;
                }else if((arr1[i]<50)&&(arr1[i]%2==1)) {
                    arr1[i]=(arr1[i]*2)+1;
                }else {
                    cnt++;
                }

            }
            answer++;
        }
        return answer;
    }
}