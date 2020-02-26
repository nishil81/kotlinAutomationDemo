import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import java.net.URL


abstract class TestBase {
    var driver: AndroidDriver<*>? = null

    @BeforeTest
    fun init() {

        val caps = DesiredCapabilities()

        caps.setCapability("deviceName", "ce051715b2392a1203")
        caps.setCapability("platformName", "Android")
        caps.setCapability("app", "E:\\Project\\Kotlin\\Freelancer-Upwork_1.8.0.apk")
        caps.setCapability("clearSystemFiles", true)
        caps.setCapability("automationName", "UiAutomator2")
        caps.setCapability("newCommandTimeout", "6000")
        caps.setCapability("autoGrantPermissions", true)
        caps.setCapability("autoAcceptAlerts", true)
        driver = AndroidDriver<MobileElement>(URL("http://localhost:4723/wd/hub"), caps)
        println("Open Application")

    }

    @AfterTest
    fun closeDriver() {
        driver?.quit()
        println("Close Application")
    }
}


