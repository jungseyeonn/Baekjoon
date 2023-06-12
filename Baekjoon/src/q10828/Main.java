package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StackExample se;
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			se = new StackExample(cnt);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String str = st.nextToken();

				if (str.equals("push")) {
					String str2 = st.nextToken();
					int p = Integer.parseInt(str2);
					se.push(p);
				} else if (str.equals("pop")) {
					se.pop();
				} else if (str.equals("size")) {
					se.size();
				} else if (str.equals("empty")) {
					se.empty();
				} else if (str.equals("top")) {
					se.top();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
