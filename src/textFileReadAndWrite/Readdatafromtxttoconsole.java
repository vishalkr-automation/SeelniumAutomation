package textFileReadAndWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.annotations.Test;

public class Readdatafromtxttoconsole {
  @Test
  public void ReadDatafromtxt() throws Exception {
	  File f=new File("F:\\workspace2\\MobileAutomation\\Testdata\\testdata.txt");
	  FileReader fr=new FileReader(f);
	  BufferedReader br=new BufferedReader(fr);
	  String str="";
	  //str=br.readLine();
	  while((str=br.readLine())!=null){
		  System.out.println(str);
	  }
  }
}
