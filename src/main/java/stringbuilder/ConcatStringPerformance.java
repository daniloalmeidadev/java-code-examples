package stringbuilder;

import java.time.Duration;
import java.time.Instant;

public class ConcatStringPerformance {

	public static void main(String[] args) {
		int quantityLoop = 1000000;
		String textExample = "bla bla bla";

		System.out.println("\n\tLoop com " + quantityLoop + " strings com o texto \"" + textExample + "\": \n");

		usingStringFormat(quantityLoop, textExample);
		usingConcat(quantityLoop, textExample);
		usingStringConcat(quantityLoop, textExample);
		usingStringBuilder(quantityLoop, textExample);
	}

	private static String usingStringFormat(int quantityLoop, String textExample) {
		String stringToConcat = "";
		Instant start = Instant.now();

		for (int i = 0; i < quantityLoop; i++) {
			stringToConcat = String.format("%s%s", stringToConcat, textExample);
		}

		Long duration = Duration.between(start, Instant.now()).toMillis();
		System.out.println(" - Com o String.format durou " + duration + " milisegundos;");
		return stringToConcat;
	}

	private static String usingConcat(int quantityLoop, String textExample) {
		String stringToConcat = "";
		Instant start = Instant.now();

		for (int i = 0; i < quantityLoop; i++) {
			stringToConcat += textExample;
		}

		Long duration = Duration.between(start, Instant.now()).toMillis();
		System.out.println(" - Com o contatenação += durou " + duration + " milisegundos;");
		return stringToConcat;
	}

	private static String usingStringConcat(int quantityLoop, String textExample) {
		String stringToConcat = "";
		Instant start = Instant.now();

		for (int i = 0; i < quantityLoop; i++) {
			stringToConcat = stringToConcat.concat(textExample);
		}

		Long duration = Duration.between(start, Instant.now()).toMillis();
		System.out.println(" - Com a String.concat durou " + duration + " milisegundos;");
		return stringToConcat;
	}

	private static String usingStringBuilder(int quantityLoop, String textExample) {
		StringBuilder stringToConcat = new StringBuilder();
		Instant start = Instant.now();

		for (int i = 0; i < quantityLoop; i++) {
			stringToConcat.append(textExample);
		}

		Long duration = Duration.between(start, Instant.now()).toMillis();
		System.out.println(" - Com o StringBuilder durou " + duration + " milisegundos");
		return stringToConcat.toString();
	}
	
}
