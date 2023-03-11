package Functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest{
	
		public static void main(String[] args) 
		{
			
			List<String> Strings= Arrays.asList("tamilnadu","kerala","karnataka","andrapradesh");
			
			
			Function <String,Integer>f=(str)->
			{
				return str.length();
			};
			
			//printlength(Strings,f);
			
			
			Function <String,String>f1=(str)->
			{
				return str.toLowerCase();
			};
			//uppercase(Strings,s);
			
			//System.out.println(" ");
			
			Function <String,String> f2=(str)->{
				return str.toUpperCase();
				};
				//lowercase(Strings,l);
			Funtion <String,String>
			
			
			
			for(String str : Strings)
			{
				System.out.println(f.apply(str));
			}

}

		private static void lowercase(List<String> strings, Function<String, String> l) {
			// TODO Auto-generated method stub
			
		}

		private static void printlength(List<String> strings, Function<String, Integer> f) {
			// TODO Auto-generated method stub
			
		}
		public static void uppercase(List<String> strings,Function<String,String> up) {
			for(String str1: strings){
				System.out.println( up.apply(str1));
				}
			}

	}
}