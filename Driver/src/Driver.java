import Exception.FilloException;
import Fillo.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
public v_obj_id
public class Driver {
	
	
	/**
	 * @param args
	 * @throws FilloException
	 */
	/**
	 * @param args
	 * @throws FilloException
	 */
	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub
		String v_Data_sheet = "E:\\Personal\\Selenium_Proj\\Data_Sheet.xlsx";
		Fillo fillo = new Fillo();
		Connection myconn = fillo.getConnection(v_Data_sheet);
		String SQL_query = "Select * from Script";
		Recordset RS = myconn.executeQuery(SQL_query);
		System.setProperty("webdriver.ie.driver", "E:\\Personal\\Software\\Selenium\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		while (RS.next()){
			String v_obj_id = RS.getField("obj_ID").trim();
			String v_obj_class = RS.getField("Obj_Class").trim();
			String v_keyword = RS.getField("Keyword").trim();
			String v_Data = RS.getField("Data").trim();
			
			
			
		}
	}

}
