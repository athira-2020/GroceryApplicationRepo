package utilities;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileUploadUsingSendkeys(WebElement chooseFileButton,String path)
	{
		chooseFileButton.sendKeys(path);
	}

	

	

}
