package starter.search;

public class Xpath_element {

    public static String getByTestAndClass(String Text, String Class){
        String tem="//div[contains(text(),'"+Text+"')]/following-sibling::div[@class='"+Class+"']";
        return tem;
    }



}
