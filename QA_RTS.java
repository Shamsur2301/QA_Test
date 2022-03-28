package QA_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class QA_RTS {


    /**Navigate to “www.google.com”

     Select the Main Search Box and enter the text “RTS Labs”

     Click “Google Search” or press the Enter key to execute the search and await the results

     Click the first result URL from the search (Normally this will be the RTS Website)**/



    public static void main(String[] args) throws InterruptedException {


        //setting up the webDriver path below
        WebDriverManager.chromedriver().setup();


        //using the chromeOptions command to add argument in order to run the site in full maximized and in private mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized","incognito");


        //calling the chrome driver below
        ChromeDriver driver = new ChromeDriver(options);

        //navigating to google browser
        driver.navigate().to("https://www.google.com");
       //driver.manage().window().maximize(); <-- I could also this to maximize as well.

        Thread.sleep(3000);

        //selecting the main search box and writing RTS Lab below
        try {
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("RTS Labs");
        }catch(Exception error){
            System.out.println("Unable to to write on the search box");
        }//end of try & catch exception


        //entering on the searchBox below to get the search result using try catch exception
        try {
            driver.findElement(By.xpath("//*[@value='Google Search']")).submit();
        }catch(Exception error){
            System.out.println("Unable to submit the request");
        }//end of try & catch exception

        //Using sleep exception statement to wait
        Thread.sleep(3000);


        //clicking on the first link for RTS Labs using try catch exception
       try {
           driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
       }catch (Exception error){
           System.out.println("Link is not clicking");
       }//end of try & catch exception




    }//end of main class

}//end of Java class
