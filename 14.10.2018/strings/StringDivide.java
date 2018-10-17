package strings;

public class StringDivide {

	public static void main(String[] args) {
		String s = new String();
		s = "aaaaaaaaaaaa";
		int n = 4;
		String newS[] = new String[s.length() / n];
		if (s.length() % n == 0) {
			int c = 0;
			for (int i = 0; i < s.length(); i = i + n) {
				newS[c] = s.substring(i, i + n);
				c++;
			}
		} else {
			System.out.println(s + " is not divided by " + n);
		}
		for (int j = 0; j < newS.length; j++) {
			System.out.println(newS[j]);
		}
	}

}
