package Strings;

public class TestString {

	public static void main(String[] args) {
		
//		byte bytes[]= {65,66,67,68,69};
//		
//		String str=new String(bytes);
//		System.out.println(str.length());
//		System.out.println(str);
//		str="welcome to ust global";
//		
//		bytes=str.getBytes();
//		for(byte b:bytes)
//		{
//			System.out.println(b);
//		}
//		
//		char chars[]= {'U','S','T','G'};
//		str=new String(chars);
//		System.out.println(str);
//		
//		str.getChars(0, chars.length-1, chars, 0);
//		for(char c:chars) {
//			System.out.println(c);
		
		// String string =new String ("she sells sea shells in sea shore");
		 //int c=0;
//		 for(int i=0;i<string.length();i++)
//		 {
//			 
//			 if(string.charAt(i)=='s')
//			 {
//				 c++;
//			 }
//		 }
//		 System.out.println(c);
//	
//	String string =new String ("she sells sea shells in sea shore");
//	String words[]=string.split(" ");
//	System.out.println(words.length);
//	
//	for(String word:words)
//	{
//		System.out.println(word);
//	}
//	
//		string=new String ("cartoon");
//		System.out.println(string.startsWith("car"));
//		System.out.println(string.endsWith("toon"));
//		
//		
//		string mail= new string ("naaja.fouzy@ust.com");
			
			String string = "16-11-477/6/A/3 hyderabad 50035";
			int digit=0;
			int alph=0;
			int space=0;
			int count=0;
			char c=0;
			for(int i=0;i<string.length();i++)
			{
			 c=string.charAt(i);
				if(Character.isAlphabetic(c))
				{
					alph++;
				}
				else if(Character.isDigit(c))
				{
					digit++;
				}
				else if(Character.isSpaceChar(c))
				{
					space++;
				}
				else
					count++;
			}
			System.out.println(alph);
			System.out.println(digit);
			System.out.println(space);
			System.out.println(count);
	}
	}


