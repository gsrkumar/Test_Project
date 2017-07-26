package POCS;

import java.io.File;
import java.util.Date;

import org.jopendocument.dom.OOUtils;
import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;
import org.jopendocument.sample.SpreadSheetFill;

/*class Test3{
	public static void main(String args[]){
		
		List<String> l = new ArrayList<>();
		l.add("$25,000");
		l.add("$50,000");
		l.add("N/A");
		l.add("$25,000");
		l.add("N/A");
		l.add("$75,000");
		l.add("N/A");
		
	for(int i =0;i<l.size();i++){
		System.out.println(l.get(i));
	}
	
	Collections.sort(l);
	
	for(int i =0;i<l.size();i++){
		System.out.println(l.get(i));
	}
	}
}*/
class Test3{
public static void main(String[] args) {
	 try {
	        // Load the file.
	        //File file = new File(SpreadSheetFill.class.getResource("/home/pradeep/CarrierAutomation.ods").toURI());
	        File file = new File("/home/pradeep/CarrierAutomation.ods");
	        final Sheet sheet = SpreadSheet.createFromFile(file).getSheet(0);
	        // Change date.
	        //sheet.getCellAt("I10").setValue(new Date());
	        // Change strings.
	       // sheet.setValueAt("pass", 9, 8);
	       sheet.getCellAt("B27").setValue("On site support");
	        // Change number.
	        //sheet.getCellAt("F24").setValue(3);
	        // Or better yet use a named range
	        // (relative to the first cell of the range, wherever it might be).
	        //sheet.getSpreadSheet().getTableModel("Products").setValueAt(1, 5, 4);
	        // Save to file and open it.
	        File outputFile = new File("/home/pradeep/CarrierAutomation.ods");
	        File o = sheet.getSpreadSheet().saveAs(outputFile);
	       // OOUtils.open(o);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
  }
}