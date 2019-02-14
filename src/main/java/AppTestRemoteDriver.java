import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AppTestRemoteDriver {

    protected WebDriver driver;

    @Test
    public void simpleTest() {
        WebDriver driver = null;
        try {
            // Возвращает нам Selenium server и он возвращает нам нужные браузеры.
            // Нужно для паралельного запуска тестов или запуска тестов разными пользователями на одном сервере
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), //проверяет валидность URL
                    DesiredCapabilities.chrome()); //вызывает Chrome browser
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        String eTitle = "Meet Guru99";
        String aTitle = "";

        // запустить браузер и перейти по адресу
        driver.get("http://www.guru99.com/");
        // разворачивает окно браузера
        driver.manage().window().maximize();
        // получить значение у тайтла страницы
        aTitle = driver.getTitle();

        // сравнивать нужно expected with actual, чтобы не вылетало nullPointerException
        assertTrue(aTitle.contains(eTitle));
        // выполняем проверку
        assertEquals(aTitle, eTitle);


        // закрываем окно браузера
        driver.close();
    }
}
