package by.htp.string.run;

import java.util.Arrays;

public class Task24 {

	// Определить сумму всех целых чисел, встречающихся в заданном тексте.
	public static void main(String[] args) {

		String text = new String(
				"There was American Civil War from 1861 to 1865 in the US. The strenth of Union Army was bigger in 2.75 times than Confederate army.");
		text = text.replaceAll("[a-zA-Z]", "");
		text = text.trim();
		text = text.replaceAll("[\\s]{2,}", " ");
		System.out.println(text);

		String[] numbers = text.split(" ");
		System.out.println(Arrays.toString(numbers));
		String punctuation = "!\"(),.:;?";
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (!punctuation.contains(numbers[i])) {
				try {
					sum += Integer.parseInt(numbers[i]);
				} catch (NumberFormatException e) {
					continue;
				}
			}

		}

		System.out.println("Sum of whole numbers from text is - " + sum);

	}

}
