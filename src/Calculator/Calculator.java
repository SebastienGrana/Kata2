package Calculator;

import java.util.StringTokenizer;

public class Calculator {
	public int add(String numbers) {
		// final result
		int result = 0;
		char customDelimiter;
		String delimiter = "\n,//";
		int curentNumber;
		if (!numbers.isEmpty()) {
			
			// single number
			if (numbers.length() == 1) {
				result = Integer.parseInt(numbers);
			} else {
				// get custom delimiter, 3rd character
				if (numbers.substring(0, 2).equals("//")) {
					customDelimiter = numbers.charAt(2);
					delimiter += customDelimiter;
				}

				// loop through the strings tokens and sum up
				StringTokenizer stringTokenizer = new StringTokenizer(numbers, delimiter);

				while (stringTokenizer.hasMoreElements()) {
					curentNumber = Integer.parseInt(stringTokenizer.nextToken());
					if(curentNumber > 1000){
						continue;
					}
					if(curentNumber < 0){
						result =-1;
						break;
					}
					result += curentNumber;
				}
			}		
		}
		return result;
	}
}