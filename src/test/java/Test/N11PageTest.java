package Test;

import Pages.N11Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class N11PageTest extends BaseTest{

    N11Page N11Page;
    private static Logger logger = LogManager.getLogger(N11PageTest.class);

    @Before
    public void before(){
        logger.info("--Starting Driver.--");
        N11Page = new N11Page(getWebDriver());
        logger.info("Driver has been started");
    }

    @Test
    public void testLogin() throws InterruptedException{
        logger.info("--Starting Project.--");
        N11Page.start().login().search().nextPage().randomClick().addToBasket().increaseQuantity().trashBin();
        logger.info("--Project has been started.--");
    }

    @After
    public void after(){
        logger.info("--Shutting Driver--");
        tearDown();
    }
}
