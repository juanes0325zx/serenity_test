package starter.model.dashBoard;

import org.openqa.selenium.By;
import starter.search.Xpath_element;

public class dashboard {

    public static By CREDIT_AVALIABLE = By.xpath(Xpath_element.getByTestAndClass("Credit Available","balance-value"));
    public static By TOTAL_BALANCE = By.xpath(Xpath_element.getByTestAndClass("Total Balance","balance-value"));
    public static By DUE_TODAY = By.xpath(Xpath_element.getByTestAndClass("Due Today","balance-value danger"));

    //TABLE
    public static By TableRow_1_CELL_1 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","1","1"));
    public static By TableRow_1_CELL_2 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","1","2"));
    public static By TableRow_1_CELL_3 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","1","3"));
    public static By TableRow_1_CELL_4 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","1","4"));
    public static By TableRow_1_CELL_5 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","1","5"));
    public static By TableRow_2_CELL_1 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","2","1"));
    public static By TableRow_2_CELL_2 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","2","2"));
    public static By TableRow_2_CELL_3 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","2","3"));
    public static By TableRow_2_CELL_4 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","2","4"));
    public static By TableRow_2_CELL_5 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","2","5"));
    public static By TableRow_3_CELL_1 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","3","1"));
    public static By TableRow_3_CELL_2 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","3","2"));
    public static By TableRow_3_CELL_3 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","3","3"));
    public static By TableRow_3_CELL_4 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","3","4"));
    public static By TableRow_3_CELL_5 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","3","5"));
    public static By TableRow_4_CELL_1 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","4","1"));
    public static By TableRow_4_CELL_2 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","4","2"));
    public static By TableRow_4_CELL_3 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","4","3"));
    public static By TableRow_4_CELL_4 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","4","4"));
    public static By TableRow_4_CELL_5 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","4","5"));
    public static By TableRow_5_CELL_1 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","5","1"));
    public static By TableRow_5_CELL_2 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","5","2"));
    public static By TableRow_5_CELL_3 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","5","3"));
    public static By TableRow_5_CELL_4 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","5","4"));
    public static By TableRow_5_CELL_5 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","5","5"));
    public static By TableRow_6_CELL_1 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","6","1"));
    public static By TableRow_6_CELL_2 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","6","2"));
    public static By TableRow_6_CELL_3 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","6","3"));
    public static By TableRow_6_CELL_4 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","6","4"));
    public static By TableRow_6_CELL_5 = By.xpath(Xpath_element.getByDynamicTableWithClass ("table-responsive","6","5"));
//TABLE








    //public static By CREDIT_AVALIABLE2 = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
//div[contains(text(),'Due Today')]/following-sibling::div[@class='balance-value danger']
    //div[@class='table-responsive']//ancestor::div[@class='element-box-tp']
    //div[@class='table-responsive']//table//tr[6]//td[contains(@class, 'nowrap')][1]



    //By.xpath("//div[contains(text(),'Credit Available')]/following-sibling::div[@class='Balance-value']");
    //By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
}
