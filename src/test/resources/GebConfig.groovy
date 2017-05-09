import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver


baseUrl = "http://www.ebay.co.uk"
driver = { new ChromeDriver() }

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true
