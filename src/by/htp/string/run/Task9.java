package by.htp.string.run;

import java.util.Arrays;

public class Task9 {

	// Определить, сколько раз повторяется в тексте каждое слово, которое
	// встречается в нем.
	public static void main(String[] args) {

		String text = new String("Live! love? live. pain, fear Money! money");

		String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split(" ");
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));

		// Count how many times every word meets in text and print result to the console
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			if (i == (words.length - 1) && !(words[words.length - 1].equals(words[words.length - 2]))) {
				System.out.println("The word - " + words[i] + " meets in text " + count + " time(s)");
			} else {
				for (int j = i + 1; j < words.length; j++) {
					if (words[i].equals(words[j])) {
						count++;
					} else {
						System.out.println("The word - " + words[i] + " meets in text " + count + " time(s)");
						i = j - 1;
						break;
					}
				}
			}
		}
	}
}
