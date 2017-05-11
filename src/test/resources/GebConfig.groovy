import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver


baseUrl = "http://www.amazon.co.uk"
driver = { new ChromeDriver() }

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true
waiting {
    timeout = 8
    retryInterval = 0.5
}