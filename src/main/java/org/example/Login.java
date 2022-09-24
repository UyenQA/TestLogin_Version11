package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        @Test
        public void login () {
// tạo 1 Selenium WebDriver
            System.setProperty("webdriver.chrome.driver", "driverBrowser");
            WebDriver driver = new ChromeDriver();
            // configure cho web
            driver.manage().window().maximize();
// điều hướng đến trang web
            driver.get("https://app-test.pito.vn/");
            //tìm element của web
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement Login = driver.findElement(By.xpath("//button[text()='Đăng nhập']"));
// input data để nhập vào các field đã tìm thấy
            username.sendKeys("angela.hoangha@gmail.com");
            password.sendKeys("Uyen1234!@");
            Login.click();
// kết quả
            String actualUrl = "https://app-test.pito.vn/dathang";
            String expectedUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl);
            if (actualUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println("Test passed");
            } else {
                System.out.println("Test failed");
            }
        }
    }
}
