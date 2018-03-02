package by.htp.string.run;

public class Task28 {

	// Преобразовать текст так, чтобы только первые буквы каждого предложения были
	// заглавными.
	public static void main(String[] args) {

		String text = new String("oH, wHat A DaY? whAt a lOvElY Day!");
		text = text.toLowerCase();
		String endOfSentence = "!.?";

		StringBuilder textCopy = new StringBuilder(text);
		// Make to upper case the first letter of our sentence
		text = text.substring(0, 1).toUpperCase() + text.substring(1);

		// Find in text "!.?" and make the first letter of next word to upper case
		for (int i = 0; i < textCopy.length() - 3; i++) {
			char[] c = new char[] { textCopy.charAt(i) };
			String temp = new String(c);
			if (endOfSentence.contains(temp)) {
				text = text.substring(0, i + 2) + text.substring(i + 2, i + 3).toUpperCase() + text.substring(i + 3);
			}
		}
		System.out.println(text);
	}
}
