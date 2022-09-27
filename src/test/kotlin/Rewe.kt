import com.tngtech.jgiven.Stage
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

open class Rewe : Stage<Rewe?>() {
    fun go_to_rewe(driver: AppiumDriver?, wait: WebDriverWait): Rewe? {
        wait.until(
            ExpectedConditions.presenceOfElementLocated
                (By.id("de.payback.client.android:id/tile"))).isDisplayed
        driver?.findElements(
            By.id(
                "de.payback.client.android:id/tile"))?.get(1)?.click()
        return self()
    }
}