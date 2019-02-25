
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T; testCase++) {
			int n = Integer.parseInt(br.readLine());

			int tmp = 0;
			int min = Integer.MAX_VALUE;
			int cnt = 0;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				tmp = Math.abs(Integer.parseInt(st.nextToken()));
				if (tmp < min) {
					cnt = 1;
					min = tmp;
				} else if (tmp == min) {
					cnt++;
				}
			}

			System.out.println("#" + testCase + " " + min + " " + cnt);
		}
	}
}
