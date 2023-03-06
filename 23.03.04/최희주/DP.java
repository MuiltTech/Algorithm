import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DP {
	static int N;
	static int[] arr;
	static int[] dp;
	static int max;
	
	public static void main(String[] args)  {
		
		Scanner in = new Scanner(System.in);
		
		// 주어질 정수의 개수(입력 1)
		int N = in.nextInt();
		
		// 배열 생성
		arr = new int[N];
		dp = new int[N];
		
		// 주어질 배열(입력 2)
		for(int i = 0 ; i < N ; i++) {
			arr[i] = in.nextInt();
		}
		
		//초기값 설정
		dp[0] = arr[0];
		max = arr[0];
		
		// 연속합 구하기
		for(int i = 1 ; i < N ; i++) {	
			dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
			max = Math.max(max, dp[i]);
	}	
		// 출력
		System.out.println(max);
		}
}
