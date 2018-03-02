package by.htp.string.run;

public class Task2 {

	// В тексте каждую букву заменить ее порядковым номером в алфавите.
	// При выводе в одной строке печатать текст с двумя пробелами между буквами,
	// в следующей строке внизу под каждой буквой печатать ее номер.
	public static void main(String[] args) {

		StringBuilder text = new StringBuilder("Hey, Bella, do you wanna go to the cinema this weekend with me?");
		System.out.println(text);
		char A = 'A';
		char Z = 'Z';

		String textUpper = text.toString();
		textUpper = textUpper.toUpperCase();
		StringBuilder textInNumbers = new StringBuilder(textUpper);

		// If symbol situated between A and Z, we change it to his position in alphabet
		for (int i = 0; i < textInNumbers.length(); i++) {
			if ((textInNumbers.charAt(i) >= A) && (textInNumbers.charAt(i) <= Z)) {
				char temp = textInNumbers.charAt(i);
				int positionInAlphabet = (int) temp - 64;
				textInNumbers.deleteCharAt(i);
				textInNumbers.insert(i, positionInAlphabet);
			}
		}

		System.out.println(textInNumbers);

		for (int i = 0; i < text.length(); i++) {
			System.out.print(" ");
			System.out.print(text.charAt(i));
			System.out.print("  ");
		}

		System.out.println();

		for (int i = 0; i < textInNumbers.length(); i++) {
			System.out.print(" ");
			System.out.print(textInNumbers.charAt(i));
			System.out.print(" ");
		}

	}

}
