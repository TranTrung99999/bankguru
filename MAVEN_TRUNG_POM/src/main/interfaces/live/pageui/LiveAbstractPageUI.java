package live.pageui;

public class LiveAbstractPageUI {
	public static final String dynamic_header_link = "//*[@id='header-account']//a[text()='%s']";
	public static final String dynamic_footer_link = "//div[@class='footer']//a[text()='%s']";
	public static final String dynamic_common_link = "//a[text()='%s']";
	public static final String dynamic_product_image = "//a[@title='%s']//img";
	public static final String dynamic_product_name = "//h2[@class='product-name']//a[@title='%s']";
	public static final String dynamic_product_price = "//h2[@class='product-name']//a[@title='%s']/parent::h2/following-sibling::div[@class='price-box']//span[@class='price']";
	public static final String dynamic_product_tv_price = "//h2[@class='product-name']//a[@title='LG LCD']//parent::h2//following-sibling::div[@class='price-box']//p[@class='special-price']//span[contains(text(),'$615.00')]";
	public static final String dynamic_addToCart_btn = "//h2[@class='product-name']/a[@title='%s']/parent::h2/following-sibling::div[@class='actions']/button[@title='Add to Cart']";
	public static final String dynamic_addToWishList_Or_addToCompare_btn = "//h2[@class='product-name']/a[@title='%s']/parent::h2/following-sibling::div[@class='actions']//a[text()='%s']";
	public static final String dynamic_button = "//*[@title='%s']";
	public static final String dynamic_textbox_radiobtn_checkbox = "//*[@id='%s']";
	public static final String dynamic_header_label_text = "//div[@class='page-header-container']//span[text()='%s']";

}
