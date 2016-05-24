import java.util.StringTokenizer;

public class Calculator {
	public int add(String numbers){
		int result =0;
		if (numbers.isEmpty()) {
			
		}else if(numbers.length() == 1){
			result = Integer.parseInt(numbers);
		}else{
			StringTokenizer st = new StringTokenizer(numbers, ",");
			
			while (st.hasMoreElements()) {
				 result += Integer.parseInt( st.nextToken());
				
			}
		}
		return result;
	}
}
