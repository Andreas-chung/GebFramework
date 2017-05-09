import org.openqa.selenium.firefox.FirefoxDriver

environments {
    'firefox' {
        baseUrl = "http://www.ebay.co.uk"
        driver = { new FirefoxDriver() }
    }
    reportsDir = new File("target/geb-reports")
    reportOnTestFailureOnly = true
}

