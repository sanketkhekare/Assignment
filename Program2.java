/*
 * 
 * Developer:Sanket Khekare
 *  Write a program to scan a given folder and print the counts of files grouped by created month(i.e the month in which it is created, like Jan, Feb etc)
  Write the example output of the above program first.
  Then write the actual implementation.
 
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.BasicAttributes;


public class program2 {

	public static void func(Path path) throws IOException {
		BasicFileAttributes fatr = Files.readAttributes(path,BasicFileAttributes.class);
	        
	      
	        System.out.println(fatr.creationTime());
	       Date creationDate=new Date(fatr.creationTime().toMillis());
	       
	     
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile = new File("C:\\Users\\Sanket\\Desktop\\react");
        Path path = myfile.toPath();
        File[] ls=myfile.listFiles();
        for (File file : ls) {
        	func(path);	
		}
        
        
     
         
       
    
        
	}

	

}
