import com.tngtech.jgiven.Stage
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait


open class ActivateCoupon : Stage<ActivateCoupon?>() {
    fun activate_first_coupon(driver: AppiumDriver?, wait: WebDriverWait): ActivateCoupon? {
        wait.until(
            ExpectedConditions.presenceOfElementLocated
                (By.id("de.payback.client.android:id/not_activated_button"))).isDisplayed
        driver?.findElements(
            By.id(
                "de.payback.client.android:id/not_activated_button"))?.get(0)?.click()

        return self()
    }
}