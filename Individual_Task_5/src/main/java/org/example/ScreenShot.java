package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class ScreenShot {
    //private WebDriver driver;

    public void Screenshot(WebDriver driver) throws IOException {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path= "./screenshot/img"+ LocalDate.now().toString()+"-"+System.currentTimeMillis()+".jpg";
        File destFile=new File(path);
        FileUtils.copyFile(scrFile,destFile);


    }


}
