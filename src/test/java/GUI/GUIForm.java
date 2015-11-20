package GUI;

import database.Database;
import database.tables.Environment;
import features.CucumberRunner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rpalacios on 11/20/15.
 */
public class GUIForm extends JFrame{
    public Logger logger;
    public WebDriver driver;

    private JPanel rootpanel;
    private JButton runB;
    private JLabel browserL;
    private JComboBox browserCB;

    public GUIForm(){

        super("Run a Test");
        setContentPane(rootpanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        runB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String config;
                String screenshotsPath = "screenshotsPath=Screenshots/\n";
                String browser = "browser="+ (String) browserCB.getSelectedItem()+"\n";

                config = screenshotsPath.concat(browser);
                System.out.println(config);

                File file = new File("src/main/resources/config.properties");

                try{
                    // Create file
                    FileWriter fstream = new FileWriter(file,false);
                    BufferedWriter out = new BufferedWriter(fstream);
                    out.write(config);
                    //Close the output stream
                    out.close();
                }
                catch (IOException ioe){
                    JOptionPane.showMessageDialog(GUIForm.this,ioe.getMessage());
                }

                new JUnitCore().run(CucumberRunner.class);
                dispose();
                new GUIForm();
                //JOptionPane.showConfirmDialog(GUIForm.this, "Test is running");
            }
        });


    setVisible(true);

    }

    public void driverSetUp() throws java.sql.SQLException, IOException {

        // Set up a simple configuration that logs on a file.
        logger = Logger.getLogger(this.getClass());
        BasicConfigurator.configure();

        logger.info("\n ---------------------------------------------------- Starting Test ----------------------------------------------------");
        // System.setProperty("logfile.name","Logs/dev.log");

        //EnvironmentSetUp();

        Environment environment = (Environment) new Database().get(Environment.class, 1);
        logger.info("Open page "+environment.getUrl());
        driver = new FirefoxDriver();
        driver.get(environment.getUrl());
    }
}
