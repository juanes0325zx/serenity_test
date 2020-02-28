package starter.model.facebook_publiction;

import org.openqa.selenium.By;

public class facebook_register {
    // public static By txt_mail_confirm = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='_5-ah']//div[@id='u_0_12']");
    //public static By btn_register = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='_1lch']//button");
    //public static By btn_sex_female = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='mtm _5wa2 _5dbb']//span[@class='_5k_2 _5dba']//input[@id='u_0_9']");
    //    public static By btn_sex_male = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='mtm _5wa2 _5dbb']//span[@class='_5k_2 _5dba']//input[@id='u_0_a']");
    //    public static By btn_sex_custom = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='mtm _5wa2 _5dbb']//span[@class='_5k_2 _5dba']//input[@id='u_0_b']");
    //  public static By txt_passwoard = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='mbm _br- _a4y']//div[@id='u_0_z']");
    // public static By txt_mail_phone = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='mbm _a4y']//div[@id='u_0_u']");
    //public static By txt_lastname = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='clearfix _58mh']//div[@id='u_0_r']");
    //public static By txt_name = By.xpath("//div[@class= '_4bl7 _m-_ _8fgm']//div[@class='_58mf']//div[@id='reg_box']//form[@id='reg']//div[@class='clearfix _58mh']//div[@id='u_0_p']");
    public static By txt_name = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='fullname_field']//div[@class='clearfix _58mh']//div[@id='u_0_l']//input");
    public static By txt_lastname = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='fullname_field']//div[@class='clearfix _58mh']//div[@id='u_0_n']//input");
    public static By txt_mail_phone = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//input[@id='u_0_r']");
    public static By txt_passwoard = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//input[@id='u_0_w']");
    public static By btn_sex_female = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//span [@class='_5k_3']//input[@id='u_0_9']");
    public static By btn_sex_male = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//span [@class='_5k_3']//input[@id='u_0_a']");
    public static By btn_sex_custom = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//span [@class='_5k_3']//input[@id='u_0_b']");
    public static By btn_register = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//button[@type='submit']");
    public static By emergentWindow_Title = By.xpath("//div[@class='_4t2a']//div[@class='clearfix']//h3[@id='u_0_2']");
    public static By emergentWindow_btn_no = By.xpath("//div[@class='_4t2a']//div[@class='_5lnf uiOverlayFooter _5a8u']//a");
    public static By emergentWindow_btn_yes = By.xpath("//div[@class='_4t2a']//div[@class='_5lnf uiOverlayFooter _5a8u']//button");
    public static By txt_input_security_code_phone = By.xpath("//div[@id='globalContainer']//div[@class='fb_content clearfix ']//form//div[@class='_8n2n _8na1']//input");
    public static By txt_mail_confirm = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//input[@id='u_0_u']");
    public static By btn_continue_register_mail = By.xpath("//div[@id='globalContainer']//div[@class='fb_content clearfix ']//form//div[@class='_4-u2 _5x_7 _p0k _5x_9 _4-u8']//div[@class='_5hzs']//button");
    public static By chk_captcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
    public static By btn_captcha_continue = By.xpath("//div[@id='globalContainer']//div[@class='fb_content clearfix ']//div[@class='_5hzs']//button");
    public static By txt_setPhone_mail = By.xpath("//input[@type='tel']");
    public static By btn_send_phone = By.xpath("//button[@class='_42ft _4jy0 _2kak _4jy4 _4jy1 selected _51sy']");
    public static By open_span_list = By.xpath("//div[@id='u_m_4']//span[@class='_55pe']");
    public static By span_selector_colombia = By.xpath("//div[@class='uiScrollableAreaBody']//div[@class='uiScrollableAreaContent']//ul[@class='_54nf']//li[@class='_54ni __MenuItem'][46]");
    public static By txt_input_security_code_mail = By.xpath("//form//input[@class='inputtext _55r1 _4xrb']");
    public static By button_contiue_otp_phone_mail = By.xpath("//div[@class='_5hzs']//button[1]");
    public static By selector_year = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//span[@class='_5k_4']//select[@id='year']");
    public static By selector_year_option_1994 = By.xpath("//div[@id='globalContainer'] //div[@class='_5iyz']//div[@id='registration_container']//div[@id='reg_box']//form//div[@id='reg_form_box']//span[@class='_5k_4']//select[@id='year']//option[@value='1994']");







}
