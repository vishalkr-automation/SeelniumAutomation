package textFileReadAndWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


import org.testng.annotations.Test;

public class WriteReadTxtfile {
  @Test
  public void WriteData_toTxtfile() throws Exception {
	  File f=new File("F:\\workspace2\\MobileAutomation\\Testdata\\testdata.txt");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);
	  bw.write("abc");
	  bw.newLine();
	  bw.write("abc1");
	  bw.newLine();
	  bw.write("abc2");
	  bw.newLine();
	  bw.close();
  }
}
