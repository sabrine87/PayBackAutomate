import com.tngtech.jgiven.Stage
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

open class Filter : Stage<Filter?>() {
    fun go_to_filter_page(driver: AppiumDriver?, wait: WebDriverWait): Filter? {
        driver?.findElement(
            By.id(
                "de.payback.client.android:id/coupon_center_dest"))?.click()
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("de.payback.client.android:id/filter_button"))).click()
        return self()
    }
}