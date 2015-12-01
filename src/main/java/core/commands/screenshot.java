package core.commands;

import core.AutomationSetUp;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.io.File;
import java.io.IOException;

/**
 * Created by rpalacios on 11/13/15.
 */
public class screenshot extends AutomationSetUp{

    Logger logger = Logger.getLogger(this.getClass());

    public void fullScreenshot(WebDriver driver) throws IOException {
       try{
            logger.info("Full screenshot taken and saved at screenshots/fullscreenshot.png");
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("screenshots/fullscreenshot.png"));
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    public void elementScreenshot(WebElement element, WebDriver driver) {
        try{
            logger.info("Web element screenshot taken and saved at screenshots/elementscreenshot.png");
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            Point p = element.getLocation();

            int width = element.getSize().getWidth();
            int height = element.getSize().getHeight();

            BufferedImage img = ImageIO.read(scrFile);

            BufferedImage dest = img.getSubimage(p.getX(), p.getY(), width, height);

            ImageIO.write(dest, "png", scrFile);

            FileUtils.copyFile(scrFile, new File("screenshots/elementscreenshot.png"));
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    public void partialScreenshot(WebElement element, WebDriver driver) {
        try{
            logger.info("Partial screenshot taken and saved at screenshots/partialscreenshot.png");
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            BufferedImage img = ImageIO.read(scrFile);

            if(img.getHeight()>1500) {

                Point p = element.getLocation();

                int width = element.getSize().getWidth();
                int height = element.getSize().getHeight();

                Rectangle rect = new Rectangle(width + 500, height + 1300);


                BufferedImage dest = null;
                try {
                    dest = img.getSubimage(p.getX() - 250, p.getY() - 250, img.getWidth(), rect.height);
                } catch (RasterFormatException e) {
                    int x = 0, y = 0;
                    if (p.getX() - 250 < 0) x = 0;
                    else x = p.getX();
                    if (p.getY() - 250 < 0) y = 0;
                    else y = p.getY();
                    dest = img.getSubimage(x, y, img.getWidth(), rect.height);

                }

                ImageIO.write(dest, "png", scrFile);
            }
            //FileUtils.copyFile(scrFile, new File("/Users/rpalacios/Desktop/screenshots/partialscreenshot.png"));
            FileUtils.copyFile(scrFile, new File("screenshots/partialscreenshot.png"));
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
