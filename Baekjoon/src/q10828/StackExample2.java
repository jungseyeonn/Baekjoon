package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackExample2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<Integer>();
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String str = st.nextToken();

				if (str.equals("push")) {
					String str2 = st.nextToken();
					int p = Integer.parseInt(str2);
					stk.push(p);
				} else if (str.equals("pop")) {
					if(stk.size()>0) {
						System.out.println(stk.pop());
					} else {
						System.out.println("-1");
					}
				} else if (str.equals("size")) {
					System.out.println(stk.size());
				} else if (str.equals("empty")) {
					if(stk.empty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				} else if (str.equals("top")) {
					System.out.println(stk.peek());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

