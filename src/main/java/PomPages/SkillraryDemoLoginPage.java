package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class SkillraryDemoLoginPage 
{
  @FindBy(id ="course")
  private WebElement coursetab;
  
  @FindBy(name="addresstype")
  private WebElement coursedd;
  
  public WebElement getCoursedd() {
	return coursedd;
}
public WebElement getCoursetab() {
	return coursetab;
}

@FindBy(xpath ="(//a[text()='Selenium Training'])[1]")
  private WebElement seleniumtraining;
  
  //it is navigating to new page
//initialization
  public SkillraryDemoLoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  public void seleniumtrainingtab()
  {
	  seleniumtraining.click();
  }
}
