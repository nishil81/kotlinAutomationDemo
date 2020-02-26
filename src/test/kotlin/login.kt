import io.appium.java_client.MobileElement
import org.openqa.selenium.By
import org.testng.Assert
import org.testng.annotations.Test

class LoginTest() : TestBase(){
    @Test
    fun login(){
        Thread.sleep(2000)

        var upworkLogo: MobileElement= driver?.findElement(By.id("com.upwork.android.apps.main:id/logo")) as MobileElement
        Assert.assertTrue(upworkLogo.isDisplayed)
        println("Verified Upwork logo is displayed")

        driver?.findElement(By.id("com.upwork.android.apps.main:id/loginButton"))?.click()
        println("Click on login button")
        Thread.sleep(20000)
        driver?.findElement(By.xpath("//android.widget.EditText[@resource-id='login_username']"))?.sendKeys("dharendra")
        println("Enter 'dharendra' in to email text box")
        driver?.findElement(By.xpath("//android.widget.Button[@text='Continue']"))?.click()
        Thread.sleep(3000)
        var loginButton: MobileElement= driver?.findElement(By.xpath("//android.widget.Button[@text='Log In']")) as MobileElement
        driver?.findElement(By.xpath("//android.widget.EditText[@resource-id='login_password']"))?.sendKeys("strange!")
        println("Enter password in to password text box")

        Assert.assertTrue(loginButton.isDisplayed)
        println("Verified Login button is displayed")
        loginButton.click()
        println("Click on login button")
        Thread.sleep(25000)

        var element: MobileElement = driver?.findElement(By.id("com.upwork.android.apps.main:id/title")) as MobileElement

        Assert.assertTrue(element.isDisplayed)
        println("Verified Jobs page is displayed")
    }
}