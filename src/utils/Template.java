package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Light competitive programming template to handle heavy reads and writes with large buffer space
 */

public class Template {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer tr = null;
	public static PrintWriter out = new PrintWriter(System.out);


	public static void main(String[] args) {
		solve();
		out.close();
	}

	private static void solve() {
		
		
	}

	public static String n() {
		while (tr == null || !tr.hasMoreTokens()) {
			try {
				tr = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return tr.nextToken();
	}

	public static int ni() {
		return Integer.parseInt(n());
	}

	public static long nl() {
		return Long.parseLong(n());
	}
}
