package zipExample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.openqa.selenium.io.Zip;
import org.testng.annotations.Test;

public class Program_ZIP_Folder {
	
	@Test 
	public void f() throws IOException{
	
	
	File src=new File("C:\\Users\\vishalkumar\\Desktop\\ZipExample\\zip1");
	File dest=new File("C:\\Users\\vishalkumar\\Desktop\\Student Explore2\\results.zip");
	
	try
	  {
	 
	    ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
	   BufferedInputStream in = null;
	   byte[] data  = new byte[1000];
	   String files[] = src.list();
	 
	  for (int i=0; i<files.length; i++)
	  {
	     in = new BufferedInputStream(new FileInputStream(src.getPath() + "/" + files[i]), 1000);  
	     out.putNextEntry(new ZipEntry(files[i])); 
	     int count;
	              while((count = in.read(data,0,1000)) != -1)
	               {
	                    out.write(data, 0, count);
	               }
	              out.closeEntry();
	  }
	 out.flush();
	out.close();
	  }
	 catch(Exception e)
	 {
	 
	 }
	 }
}
