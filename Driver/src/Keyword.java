import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Keyword {
	public enum keyword {
		lAUNCH_APP, LOGIN_APP, LOGOUT_APP, INPUT, RETRIEVE, COMPARE, ARITHMETIC_CALC, CALENDAR_ADD, ROUND_OFF, DATE_DIFFERENCE
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
