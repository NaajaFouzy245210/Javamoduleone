package methodref;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

interface Formula{
	public void n1();
	
}
class some{
	public static void n2() {
		System.out.println("from n2...");
	}
}
class other{
	other(){
		System.out.println("from other constructor");
	}
	void m2() {
		
	}
}

public class TestMethodRef {

	public static void main(String[] args) {

	Formula f =some ::n2;
	f.n1();
	
	f=other::new;	
		
	//Consumer<String> c = Other::n2;
	//f.n1();
	List<String>list=Arrays.asList("one","two","three");
	list.stream().forEach(System.out::println);
	List<Integer> intList= Arrays.asList(12,32,23,34,45);
	Optional<Integer>num=intList.stream().reduce(Math::max);
	System.out.println(num.get());
	}

}
