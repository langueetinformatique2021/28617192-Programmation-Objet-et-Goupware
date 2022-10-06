package boucles;

public class boucle_post {
	public static void main(String[] args) {

		String s1 = "azerty", s2 = "ytreza";
		int c1 = 0, c2 = s2.length() - 1;

		
		if (s1.length() == s1.length()) {
			
			do {
				c1++;
				c2--;
			}
			
			while ((c2 >= 0) && (s1.charAt(c1) == s2.charAt(c2)));
			if (c2 == -1)
				System.out.println("mot miroir");
			
		}

	}
}
