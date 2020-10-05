package Testing.Testscripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T4 {
public static void main(String[] args) throws IOException {
	


	File f = new File("C:\\Users\\pc\\Documents\\VishalSeleniumCSV.csv");
	FileReader fr = new FileReader(f);
	BufferedReader b  = new BufferedReader(fr);
	String s;
	while((s=b.readLine())!=null)
	{
		System.out.println(s);
		
		String[] s1 = s.split(",");
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
	}
	
	
	
	
	
}
	
	
	
}
