package Functionalinterface;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class supplierTest {

	public static void main(String[] args) {
		List<String> Strings= Arrays.asList("tamilnadu","kerala","karnataka","andrapradesh","telangana");
	
	
	Supplier<String> supplier = ()->{
		return new String ("hola!");
	};
	
	System.out.println(supplier.get());
}
}
	