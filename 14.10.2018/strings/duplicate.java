package strings;

public class duplicate {

	public static void main(String[] args) {
		String s = new String();
		s = "Hello There!";
		String sToRemove = new String();
		sToRemove = "TO";
		for (int i = 0; i < sToRemove.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j)==sToRemove.charAt(i)||s.charAt(j)==sToRemove.charAt(i)+32||s.charAt(j)==sToRemove.charAt(i)-32) {
					s = s.substring(0, j) + s.substring(j + 1, s.length());
					j=0;
				}
			}
		}
		System.out.println(s);
	}

}
