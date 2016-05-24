import java.util.StringTokenizer;

import org.omg.CORBA.Environment;

public class Calculator {
	public int add(String numbers) {
		// final result
		int result = 0;
		if (numbers.contains("\n")) {
			numbers.replaceAll("\\\\n", ",");
			if (numbers.contains("\n")) {
				result=-1;
			}
		} else {
			// single number
			if (numbers.length() == 1) {
				result = Integer.parseInt(numbers);
			} else {
				// loop through the strings tokens and sum up
				StringTokenizer stringTokenizer = new StringTokenizer(numbers, ",");

				while (stringTokenizer.hasMoreElements()) {
					result += Integer.parseInt(stringTokenizer.nextToken());

				}
			}
		}
		return result;
	}
}
