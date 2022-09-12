package scripts;

import java.io.IOException;
import org.testng.annotations.Test;
import PomPages.CorejavaPage;
import PomPages.SkillraryLoginPage;
import PomPages.WishlistPage;
import genericLibrary.BaseClass;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException 
	{
		SkillraryLoginPage  s=new SkillraryLoginPage(driver);
		s.searchTextbox(pdata.getPropertydata("coursedata"));
	    s.gobutton();
	    
	    CorejavaPage c=new CorejavaPage(driver);
	    c.seleniumtrainting();
	    
	    WishlistPage w=new WishlistPage(driver);
	    utilies.switchFrame(driver);
	    Thread.sleep(5000);
	    w.playbutton();
	    Thread.sleep(10000);
	    w.pausebutton();
	    utilies.switchbackframe(driver);
	    w.addtowishlistbtn();
	
	}
}
