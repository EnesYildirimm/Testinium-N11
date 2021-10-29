package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static Constant.Constants.*;

public class N11Page extends BasePage {


    public N11Page(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = LogManager.getLogger(BasePage.class);

    public N11Page start()  {     // Web sitesinin sayfa başlığı(PAGE_TITLE) kontrol ediliyor.
        logger.info("--Preparing starting conditions.--");
        assertionPage(PAGE_TITLE);
        logger.info("--Starting conditions have been checked properly.--");
        return this;
    }

    public N11Page login() throws InterruptedException {    // Üye girişi(USERNAME,PASSWORD) yapılıyor.
        logger.info("--Signing in.--");
        click(LOGIN);
        //findElement(USERNAME_FIELD).clear();
        // findElement(PASSWORD_FIELD).clear();
        sendKeys(USERNAME_FIELD,USERNAME);
        sendKeys(PASSWORD_FIELD,PASSWORD);
        click(LOGIN_BUTTON);
        Thread.sleep(6000);    // Statik bekleme süresi ekliyoruz ve işlemci 6 saniyeliğine boşa çıkartılıyor.
        logger.info("--Signed in successfully.--");
        return this;
    }

    public N11Page search() throws InterruptedException {    // Arama kutusuna(SEARCH_BOX) bilgisayar kelimesi yazılıyor ve arama butonuna(SEARCH_BUTTON) tıklanıyor.
        logger.info(PRODUCT + "--the word 'bilgisayar' has been written in search box.--");
        findElement(SEARCH_BOX);
        sendKeys(SEARCH_BOX,PRODUCT);
        click(SEARCH_BUTTON);
        Thread.sleep(3000);
        click(PICK_NOTEBOOK);
        logger.info(PRODUCT + "--has been found.--");
        return this;
    }

    public N11Page nextPage() throws InterruptedException {  /* Bir sonraki sayfaya geçmek için ileri butonu(NEXT_PAGE_BUTTON) bulunup tıklanıyor.
        İkinci sayfaya ulaşıldığı(NEXT_PAGE_CHECK) sayfanın URL'i kullanılarak kontrol ediliyor. */
        logger.info("--Clicking to the next page button.--");
        scrollToElement(NEXT_PAGE_BUTTON);
        click(NEXT_PAGE_BUTTON);
        Thread.sleep(5000);
        assertionUrl(NEXT_PAGE_CHECK);
        logger.info("--Moved into the next page successfully--");
        return this;
    }

    public N11Page randomClick(){   // Ürün listesi içerisinde(PRODUCT_LIST) rastgele tıklama işlemi yapılıyor.
        randomItemClick(PRODUCT_LIST);
        logger.info("--Picking a product randomly.--");
        return this;
    }

    public N11Page addToBasket(){ /* Ürünün sepete eklenmeden önceki fiyatı(PRODUCT_PRICE) ile
        sepete eklendikten sonraki fiyatı(BASKET_PRICE) kıyaslanıyor.  */
        logger.info("--Adding product to the basket, moving into basket and checking product quantity--");
        click(ADD_TO_BASKET);
        click(GO_TO_BASKET);
        Assert.assertEquals(findElement(BASKET_PRICE).getText(),findElement(PRODUCT_PRICE).getText());
        logger.info("--Product has been added to the basket, moving the product into basket is controlled--");
        return this;
    }

    public N11Page increaseQuantity(){  /* Adet arttırma butonuna(QUANTITY_INCREASE_BUTTON) tıklama işlemi yapılarak
        ürün adedi arttırılıyor. Ürün sayfasında yer alan fiyat ile sepetteki fiyat kıyaslanıyor. */
        logger.info("--Increasing quantity.--");
        click(QUANTITY_INCREASE_BUTTON);
        Assert.assertEquals(findElement(PRODUCT_QUANTITY).getAttribute("value"),"2");
        logger.info("--Quantity has been increased and product quantity has been checked.--");
        return this;
    }

    public N11Page trashBin(){  /* Son olarak ürünü çöp kutusuna(TRASH_BİN) göndererek silme işlemi yapılıyor ve
        sepetin boş olup olmadığı kontrol ediliyor. */
        click(TRASH_BIN);
        Assert.assertEquals(findElement(BASKET_CHECK).getText(),"Sepetiniz Boş");
        logger.info("--Thrash bin has been clicked and basket has been checked--");
        return this;
    }

}
