package by.htp.string.run;

public class Task32 {

	// ����������, ������� ��� �������� ����� ������ � �����.
	public static void main(String[] args) {

		String text = new String("Oh, what a day? What a lovely day!");
		text = text.toLowerCase().replaceAll("[^a-z ]", "");

		String word = "Day";

		int i = text.indexOf(word.toLowerCase());
		int count = 0;
		while (i >= 0) {
			count++;
			i = text.indexOf(word.toLowerCase(), i + 1);
		}
		System.out.println("The word " + word + " meets in text " + count + " time(s)");
	}

}
