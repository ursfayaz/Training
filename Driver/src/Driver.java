import Exception.FilloException;
import Fillo.*;


import org.openqa.selenium.ie.*;
import org.openqa.selenium.*;

public class Driver {
	
	public enum keyword {
		lAUNCH_APP, LOGIN_APP, LOGOUT_APP, INPUT, RETRIEVE, COMPARE, ARITHMETIC_CALC, CALENDAR_ADD, ROUND_OFF, DATE_DIFFERENCE
	}

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
			keyword v_obj_keyword = keyword.valueOf(v_keyword);
			switch (v_obj_keyword){
			case lAUNCH_APP:
				
				System.out.println(v_Data);
				driver.get(v_Data);
				
			case INPUT:
				
				WebElement TXT_name = driver.findElement(By.name(v_obj_id));
				TXT_name.sendKeys(v_Data);
				int j;
				for (j=1;j<10;j++){
					System.out.println("Iam the value : " + j);
				}
			case COMPARE:
				WebElement LBL_id = driver.findElement(By.id(v_Data));
				String v_Error_msg= LBL_id.getText();
				if (v_Error_msg == v_Data){
					System.out.println(v_Error_msg + " : Pass");				
					
				}
				else
				{
					System.out.println(v_Error_msg + " : Fail");
				}
			}
			
			
		}
	}

}
