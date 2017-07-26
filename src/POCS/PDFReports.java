package POCS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;



public class PDFReports {
    private static FileOutputStream fi;
    private static Document document;
    
    
	public static Document openDoc(String filename) throws  DocumentException{
		String path = "/home/pradeep/Automation_reports/"+filename+".pdf";
		try{
			fi = new FileOutputStream(path);
		}catch(FileNotFoundException ie){
			
		}catch (IOException e) {
			
		}catch (Exception e) {
			
		}
		
	    document = new Document();
		PdfWriter.getInstance(document,fi);
		document.open();
		/*document.add(new Paragraph("Hello iText"));
		document.add(new Paragraph("I will be printed in PDF with the help of iText"));*/
		return document;	
	}
	
	public static void closeDoc(){
		document.close();
	}
}
