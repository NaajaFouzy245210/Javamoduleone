package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromToConsole {

	public static void main(String[] args) throws Exception {
		
		FileReader reader= new FileReader("D:\\Ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
		BufferedReader buffer= new BufferedReader(reader);
		
		String data = buffer.readLine();
		while(data!=null)
		{
			System.out.println(data);
			data=buffer.readLine();
		}
		reader.close();
		buffer.close();
		
	}

}

