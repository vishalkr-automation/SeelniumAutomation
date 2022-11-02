package xmlSuiteExample;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Suite {

	public static void main(String[] args) {
		
		List<XmlSuite> suite = new ArrayList<>();
		
		XmlSuite suite1 = new XmlSuite();
		
		XmlTest test1 = new XmlTest(suite1);
		List<XmlClass> classes1 = new ArrayList<>();
		classes1.add(new XmlClass("xmlSuiteExample.NewTest1"));
		test1.setXmlClasses(classes1);
		
		XmlTest test2 = new XmlTest(suite1);
		List<XmlClass> classes2 = new ArrayList<>();
		classes2.add(new XmlClass("xmlSuiteExample.NewTest2"));
		test2.setXmlClasses(classes2);
		
		XmlTest test3 = new XmlTest(suite1);
		List<XmlClass> classes3 = new ArrayList<>();
		classes3.add(new XmlClass("xmlSuiteExample.NewTest3"));
		test3.setXmlClasses(classes3);
		
		suite.add(suite1);
		
		TestNG tg = new TestNG();
		tg.setXmlSuites(suite);
		tg.run();
		

	}

}
