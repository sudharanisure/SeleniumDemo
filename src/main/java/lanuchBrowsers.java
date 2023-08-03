import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lanuchBrowsers {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("String title"+title);
		if (title.equals("Google")) {
			System.out.println("correct title");

		}else {
			System.out.println("incorrect title");

		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
