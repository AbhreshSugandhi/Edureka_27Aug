package module10;

import java.io.IOException;

public class Execution {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		String path = "D:\\Training\\EdurekaPrograms\\Edureka_27Aug\\src\\module10\\MyDataEngine.xlsx";

		ExcelUtility.setExcel(path, 0);
		for(int i=0; i<=3; i++)
		{
			String Keyword = ExcelUtility.getData(i, 3);
			if(Keyword.equals("OpenBrowser"))
			{
				ActionKeyword.OpenBrowser();
			}
			else if (Keyword.equals("Navigate"))
			{
				ActionKeyword.Navigate();
			}
			else if (Keyword.equals("ClickGmail"))
			{
				ActionKeyword.ClickGmail();
			}
		}
		
	}

}
