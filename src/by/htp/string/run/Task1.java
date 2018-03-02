package by.htp.string.run;

public class Task1 {

	// В каждом слове текста k-ю букву заменить заданным символом.
	// Если k больше длины слова, корректировку не выполнять.
	public static void main(String[] args) {

		String text = new String("Hey, Bella, do you wanna go to the cinema this weekend with me?");
		int index = 4;
		char toChange = '!';
		String[] words = text.split(" ");
		String punctuation = "!\"(),.:;?";

		// Change letter in position (index) to symbol "toChange"
		// If the word is less then index - don't change
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= index) {
				char[] c = new char[] { words[i].charAt(index - 1) };
				String temp = new String(c);
				if (!punctuation.contains(temp)) {
					StringBuilder sb = new StringBuilder(words[i]);
					sb.deleteCharAt(index - 1);
					sb.insert(index - 1, toChange);
					words[i] = sb.toString();
				}

			}
		}

		// Concat our words in one string
		text = new String(); // If we type: text = null; - we get NPE
		for (int i = 0; i < words.length; i++) {
			text = text.concat(words[i]);
			text = text.concat(" ");
		}

		System.out.println(text);

	}

}
