package Java_14Lesson;

public class R5_3 {
	
	public static void main(String[] args) {
		
		
		String country = "China";
		String stateOrProvince = "Quebec";
		String language = "English";
		if (country.equals("Canada"))
			if (stateOrProvince.equals("Quebec")) language = "French";
			else if (country.equals("China"))
				language = "Chinese";
		System.out.println(language);
	}

}
