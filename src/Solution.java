
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int testCase = 1; testCase <= 10; testCase++) {
			st = new StringTokenizer(br.readLine());

			int length = Integer.parseInt(st.nextToken());
			String num = st.nextToken();

			for (int i = 1; i < num.length(); i++) {
				if (num.charAt(i - 1) == num.charAt(i)) {
					num = num.substring(0, i - 1) + num.substring(i + 1, num.length());
					i -= 2;
					if (i < 0)
						i = 0;
				}
			}

			System.out.println("#" + testCase + " " + num);
		} // tc
	}
}