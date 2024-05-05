package dandepreparation;

public class EncryptionLogic {

	public static void main(String[] args) {

		String testString = "deep compute";
		char[] stringToCharArray = testString.toCharArray();

		for (char output : stringToCharArray) {
			if (output != ' ') {
				System.out.print((char) ((int) output + 1));
			} else {
				System.out.print(" ");
			}
		}

		// manuplataion through ascii value Output : effq dpnqvuf

	}

}
