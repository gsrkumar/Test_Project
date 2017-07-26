package POCS;


import java.io.File;
import java.io.IOException;

import org.jopendocument.dom.spreadsheet.MutableCell;
import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;

public class ReadODSFile {
      public void readODS(File file)
      {
        Sheet sheet;
        try {
             //Getting the 0th sheet for manipulation| pass sheet name as string
             sheet = SpreadSheet.createFromFile(file).getSheet(0);
              
             //Get row count and column count
             int nColCount = sheet.getColumnCount();
             int nRowCount = sheet.getRowCount();

             System.out.println("Rows :"+nRowCount);
             System.out.println("Cols :"+nColCount);
             //Iterating through each row of the selected sheet
             MutableCell cell = null;
             for(int nRowIndex = 0; nRowIndex < nRowCount; nRowIndex++)
             {
               //Iterating through each column
               int nColIndex = 0;
               for( ;nColIndex < nColCount; nColIndex++)
               {
                 cell = sheet.getCellAt(nColIndex, nRowIndex);
                 System.out.print(cell.getValue()+ " ");
                }
                System.out.println();
              }

            } catch (IOException e) {
              e.printStackTrace();
            }
      }
      public static void main(String[] args) {
            //Creating File object of .ods file
            File file = new File("/home/pradeep/CarrierAutomation.ods");
            ReadODSFile r = new ReadODSFile();
            r.readODS(file);
      }
 }


