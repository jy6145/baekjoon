import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T; testCase++) {
			String str = br.readLine();

			int sum = str.charAt(0) - '0';
			int answer = 0;
			int now = 0;
			for (int i = 1; i < str.length(); i++) {
				now = str.charAt(i) - '0';

				if (sum < i) {
					answer += i - sum;
					sum += i - sum;
				}

				sum += now;
			}

			System.out.println("#" + testCase + " " + answer);
		}
	}
}