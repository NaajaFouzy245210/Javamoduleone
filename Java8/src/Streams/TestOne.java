package Streams;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TestOne {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("sun");
		list.add("moon");
		list.add("jupiter");
		list.add("mars");
		list.add("pluto");
		list.add("venus");
		list.add("uranus");
		
	Predicate <String>p=(str)->{
		return(str.length()>3 || str.length()<10);
		
	};
		
	long count =list.stream().filter((str)->str.length()>3 || str.length()<10).count();
	System.out.println(count);
		
	Function<String,String> f=(str)->{
		return str.toUpperCase();
	};
	List<String>outList=list.stream().map(f).collect(Collectors.toList());
	System.out.println(outList);
	
	Consumer<String>c=(str)->{
		System.out.println(str);	
	};
	list.stream().forEach(c);
	list.stream().filter(p).map(f).forEach(c);
	}

}
