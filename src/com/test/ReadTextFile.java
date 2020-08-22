package com.test;

import java.io.BufferedReader;
import java.io.FileReader;

import org.testng.annotations.Test;

public class ReadTextFile {
	
	FileReader fr=null;
	BufferedReader br= null;
	
	
	String readline;
	String filepath;
	StringBuffer ab;
	String line;
	
	
	public void readTextFile(String filePath) throws Exception {
		fr = new FileReader(filePath);
		br = new BufferedReader(fr);
		
		while((readline=br.readLine())!=null) {
			
			line=readline;
		}
		System.out.println(line);
	}
	
	@Test
	public void verifyId() throws Exception {
		readTextFile("C:\\Users\\91953\\Desktop\\TestData.txt");
	}

}
