import java.util.Scanner;

public class Baekjoon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int A[] = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}

		in.close();

		// 최대한 큰 동전 먼저 사용
		for (int i = N - 1; i >= 0; i--) { // 가장 큰 동전부터 탐색
			if (A[i] <= K) { // K보다 작은 동전의 종류를 탐색
				count += (K / A[i]); // 해당 동전의 종류로 K를 나눈 몫을 구하기
				K = K % A[i]; // 동전의 몫을 구하고 나눈 나머지 값을 K에 넣는다
			} // 이후 for 문을 돌면서K가 0이 될때까지
		}
		System.out.println(count);
	}

}
