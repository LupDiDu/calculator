import org.example.Calculator;
import io.appium.java_client.android.AndroidDriver;
import org.example.Factory;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

public class CalculatorTest {
    private AndroidDriver driver;
    private Calculator calculator;
    String result;

    @BeforeEach
    public  void setUp() {
        driver = Factory.getAndroidDriver();
        calculator = new Calculator(driver);
    }

    @AfterEach
    public  void tearDown() {
        if (driver != null)
            driver.quit();
    }

    @Test
    @DisplayName("Проверка функции сложение")
    public void additionTest() {
        calculator.calculate("1+5");
        result = driver.findElement(By.id("result_final")).getText();
        Assertions.assertEquals("6", result);
    }

    @Test
    @DisplayName("Проверка функции вычитание")
    public void subtractionTest() {
        calculator.calculate("34-16");
        result = driver.findElement(By.id("result_final")).getText();
        Assertions.assertEquals("18", result);
    }

    @Test
    @DisplayName("Проверка функции умножение")
    public void multiplicationTest() {
        calculator.calculate("14*99");
        result = driver.findElement(By.id("result_final")).getText();
        Assertions.assertEquals("1386", result);
    }

    @Test
    @DisplayName("Проверка функции деление")
    public void divisionTest() {
        calculator.calculate("72/9");
        result = driver.findElement(By.id("result_final")).getText();
        Assertions.assertEquals("8", result);
    }

}
