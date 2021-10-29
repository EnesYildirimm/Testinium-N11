package Constant;

import org.openqa.selenium.By;

public class Constants {

    public static String PAGE_LINK = "https://www.n11.com/";
    public static String PAGE_TITLE = "n11.com - Hayat Sana Gelir";
    public static String USERNAME = "testiniumn11test@hotmail.com";
    public static String PASSWORD = "Testinium1";
    public static String PRODUCT = "bilgisayar";
    public static String NEXT_PAGE_CHECK = "https://www.n11.com/bilgisayar/dizustu-bilgisayar?q=bilgisayar&pg=2";
    public static final By LOGIN = By.xpath("//a[@class='btnSignIn']");
    public static final By USERNAME_FIELD = By.id("email");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("loginButton");
    public static final By SEARCH_BOX = By.id("searchData");
    public static final By SEARCH_BUTTON = By.xpath("//a[@class='searchBtn']");
    public static final By PICK_NOTEBOOK = By.xpath("//a[@href='https://www.n11.com/bilgisayar/dizustu-bilgisayar?q=bilgisayar']");
    public static final By NEXT_PAGE_BUTTON = By.xpath("//a[@class='next navigation']");
    public static final By PRODUCT_LIST = By.xpath("//h3[@class='productName ']");
    public static final By PRODUCT_PRICE = By.xpath("(//span[@class='price'])[1]");
    public static final By ADD_TO_BASKET = By.xpath("//a[@title='Sepete Ekle']");
    public static final By GO_TO_BASKET = By.xpath("//a[@title='Sepete Git']");
    public static final By BASKET_PRICE = By.xpath("//span[@class='']");
    public static final By PRODUCT_QUANTITY = By.xpath("//input[@class='quantity']");
    public static final By QUANTITY_INCREASE_BUTTON = By.xpath("//span[@class='spinnerUp spinnerArrow']");
    public static final By TRASH_BIN = By.xpath("//span[@title='Sil']");
    public static final By BASKET_CHECK = By.xpath("(//h2[@class='title'])[1]");

}
