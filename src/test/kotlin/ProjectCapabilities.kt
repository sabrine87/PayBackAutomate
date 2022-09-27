import org.openqa.selenium.remote.DesiredCapabilities

class ProjectCapabilities {
    companion object {
        fun AndroidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("appium:fullReset", false)
            caps.setCapability("appium:noReset", true)
            caps.setCapability("platformName", "Android")
            caps.setCapability("appium:automationName", "UiAutomator2")
            caps.setCapability("appium:deviceName", "Galaxy S8")
            caps.setCapability("appium:udid", "9889d633594e584853")
            caps.setCapability("appium:appPackage", "de.payback.client.android")
            caps.setCapability("appium:appActivity", "de.payback.app.deeplinks.StarterActivity")
            return caps
        }
    }
}