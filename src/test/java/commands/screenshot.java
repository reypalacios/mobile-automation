package commands;

import appium.App;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by rpalacios on 11/13/15.
 */
public class Screenshot {

    public byte[] fullScreenshot() throws IOException {

        System.out.println("Full screenshot taken");
        File scrFile = App.driver.getScreenshotAs(OutputType.FILE);
            //FileUtils.copyFile(scrFile, new File("screenshots/fullscreenshot.png"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(ImageIO.read(scrFile), "png", outputStream);

        return scale(outputStream.toByteArray(),250,500);
    }

    public void elementScreenshot(WebElement element) {
        try{
            System.out.println("Web element screenshot taken");
            File scrFile = App.driver.getScreenshotAs(OutputType.FILE);

            Point p = element.getLocation();

            int width = element.getSize().getWidth();
            int height = element.getSize().getHeight();

            BufferedImage img = ImageIO.read(scrFile);

            BufferedImage dest = img.getSubimage(p.getX(), p.getY(), width, height);

            ImageIO.write(dest, "png", scrFile);

            //FileUtils.copyFile(scrFile, new File("screenshots/elementscreenshot.png"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void partialScreenshot(WebElement element) {
        try{
            System.out.println("Partial screenshot taken");
            File scrFile = App.driver.getScreenshotAs(OutputType.FILE);
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
            //FileUtils.copyFile(scrFile, new File("screenshots/partialscreenshot.png"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public byte[] scale(byte[] fileData, int width, int height) {
        ByteArrayInputStream in = new ByteArrayInputStream(fileData);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            BufferedImage img = ImageIO.read(in);
            if(height == 0) {
                height = (width * img.getHeight())/ img.getWidth();
            }
            if(width == 0) {
                width = (height * img.getWidth())/ img.getHeight();
            }
            Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage imageBuff = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            imageBuff.getGraphics().drawImage(scaledImage, 0, 0, new Color(0,0,0), null);

            ImageIO.write(imageBuff, "png", buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toByteArray();
    }
}
