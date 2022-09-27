import com.tngtech.jgiven.junit.ScenarioTest
import io.appium.java_client.AppiumDriver
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait
import java.net.URL
import java.time.Duration

class CouponTest: ScenarioTest<Filter, Rewe, ActivateCoupon>() {
    protected var driver: AppiumDriver? = null
    protected var wait: WebDriverWait? = null
    protected var caps: DesiredCapabilities? = ProjectCapabilities.AndroidBaseCapabilities()
    private val webDriverURL: URL = URL("http://127.0.0.1:4723/wd/hub")

    @Before
    fun setUp() {
        this.driver =  AppiumDriver(webDriverURL, caps)
    }

    @Test
    fun CouponTest() {
        wait = WebDriverWait(driver?.let { it },
            Duration.ofSeconds(10))

    }

    @After
    fun tearDown() {
        this.driver?.quit() ?: throw Exception("Driver instance could not be quit.")
    }
}