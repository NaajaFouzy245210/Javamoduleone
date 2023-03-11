package optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		
		String str = null;
		String str2="hello";
		Optional<String> optional = Optional.of(str);
		
		//System.out.println(optional.get());
		Optional<String> optional2 =Optional.ofNullable(str);
		//when str is used else will be executed
		
		if(optional2.isPresent())
			System.out.println("value is present"+ optional2.get());
		else
			System.out.println("its null");
	}

}
