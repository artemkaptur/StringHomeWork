package by.htp.string.run;

public class Task7 {

	// »з текста удалить все символы, кроме пробелов, не €вл€ющиес€ буквами.
	// ћежду последовательност€ми подр€д идущих букв оставить хот€ бы один пробел.
	public static void main(String[] args) {

		String text = new String("Hey, Bella, do you wanna go to the cinema this weekend with me?");

		char[] charArr = text.toCharArray();
		char[] temp = new char[text.length()];

		int i = 0;
		// If 'c' is letter or space, we add 'c' to the temp[]
		for (char c : charArr) {
			if (Character.isLetter(c) || (c == ' ')) {
				temp[i] = c;
				i++;
			}
		}

		text = new String(temp);

		System.out.println(text);

	}

}
