package POCS;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager{

	private static ExtentReports extent;
	static String filepath;
	static String Path = "/home/pradeep/Automation_reports/"+"ExtentReport.html";
	
	@SuppressWarnings("deprecation")
	public static ExtentReports getExtentInstance(){
		 System.out.println(Path);
		 extent = new ExtentReports(Path, true);
		 extent.config()
		              .documentTitle("Google Automation")
		              .reportName("Suresh")
		              .reportHeadline("Qa testing");
		 extent.addSystemInfo("Browser","Chrome");
		 extent.addSystemInfo("Author", "Suresh");
		 
		 return extent;
	}
}
