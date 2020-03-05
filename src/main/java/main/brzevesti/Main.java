
 
package main.brzevesti;

import Helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {

  
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().window().fullscreen();
        driver.get("http:/bvtest.school.cubes.rs/login");
  
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
    
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");
    
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
    
      
        System.out.println(driver.getTitle());
    
        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
        signaturesLink.click();
        
        
        System.out.println(driver.getTitle());
  
        
   //     WebElement categoriesLink = driver.findElement(By.partialLinkText("egori"));
   //     categoriesLink.click();
    
        System.out.println(driver.getTitle());
       
        WebElement regionsLink = driver.findElement(By.partialLinkText("egions"));
        regionsLink.click();
 

        WebElement categoriesLink = driver.findElement(By.partialLinkText("egori"));
        categoriesLink.click();
   
        WebElement AddCategoryButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        AddCategoryButton.click();
        
        WebElement categoryTitileField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
        categoryTitileField.sendKeys(Helper.getRandomText());
        
        WebElement saveCategoryButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("save-category-button")));
        saveCategoryButton.click();
        
        
      //  WebElement auttheticationLinks = driver.findElement(By.className("dropdown-toggle"));
  //      auttheticationLinks.click();
        
   //     WebElement logountLink = driver.findElement(By.linkText("Logout"));
   //     logountLinkclick();
     
    }
    
    
    
    
    
    
    
}
