package POCS;

import java.io.FileNotFoundException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;

public class Test1 {
   
  Document document;
  
  @BeforeClass
  public void beforeCalss(){
	  
  }
  
  @Test
  public void t1() throws DocumentException {
	  document.add(new Paragraph("Test1 t1()"));
  }
  
  @Test
  public void t2() throws DocumentException{
	  document.add(new Paragraph("Test1 t2()"));
  }
  
  
  @Test(priority = 0)
  public void setUp() throws FileNotFoundException, DocumentException {
	  document = PDFReports.openDoc("/home/pradeep/suresh_workspace/TestProject/pdftest.pdf");
	  document.add(new Paragraph("Test1 before class"));
	  
  }
  
  @AfterTest
  public void tearDown() throws DocumentException{
	  document.add(new Paragraph("Close document"));
	  PDFReports.closeDoc();
  }

}
