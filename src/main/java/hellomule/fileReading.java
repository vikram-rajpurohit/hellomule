package hellomule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReading {

	public static void main(String args[]) throws IOException {
		
		File f=new File("G:\\batchexample\\input\\100141.csv");
	    System.out.println("file exists in path:"+f.exists());
	    BufferedReader br = new BufferedReader(new FileReader(f)); 
	    
	    String st; 
	    while ((st = br.readLine()) != null) 
	      System.out.println(st); 
	    } }
	 
	    
		
		
 
