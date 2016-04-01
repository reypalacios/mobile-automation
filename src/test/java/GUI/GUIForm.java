package GUI;

import database.Database;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by rpalacios on 11/20/15.
 */
public class GUIForm extends JFrame{

    public static String launchOn;
    public static String VD;
    public static String app;
    public static String apk;
    public static String script;
    public static String platformName;
    public static String platformVersion;
    private JPanel rootpanel;
    private JButton runB;
    private JLabel browserL;
    private JComboBox browserCB;
    public JComboBox launchonCB;
    private JLabel launchonL;
    private JPanel browserP;
    private JComboBox appCB;
    private JPanel appP;
    private JComboBox scriptCB;
    private JPanel scriptP;
    Logger logger = Logger.getLogger(this.getClass());

    public GUIForm() {

        super("Run a Test");
        setContentPane(rootpanel);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        appP.setVisible(false); //Android is the default Mobile OS - only BIApp can be tested.
        Database db = new Database();
        //db.get
        runB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    launchOn = (String) launchonCB.getSelectedItem();
                    VD = (String) browserCB.getSelectedItem();
                    app = (String) appCB.getSelectedItem();
                    script = (String) scriptCB.getSelectedItem();

                    logger.info("------------ Environmental Configurations ------------");
                    logger.info("OS = " + launchOn);
                    if (launchOn.equals("Android"))
                        logger.info("AVD = " + VD);
                    if (launchOn.equals("iOS")){
                        logger.info("Simulator = " + VD);
                        logger.info("App = " + app);
                    }
                    logger.info("Script = "+ script);
                    logger.info("------------------------------------------------------");

                    FileOutputStream out = new FileOutputStream(System.getProperty("user.dir") + "/target/classes/config.properties");
                    Properties properties = new Properties();
                    properties.setProperty("screenshotsPath", "screenshots/");
                    //properties.setProperty("laucher", (String) launcherCB.getSelectedItem());
                    properties.setProperty("browser", (String) browserCB.getSelectedItem());
                    properties.store(out, null);
                    out.close();

                    (new Runnable()).start();

                    //JOptionPane.showConfirmDialog(GUIForm.this, "Test is running");
                } catch (IOException ioe) {
                    JOptionPane.showMessageDialog(GUIForm.this, ioe.getMessage());
                }
            }
        });

        final JComboBox[] browserOptions = {null};
        launchonCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {


                Object selected[] = e.getItemSelectable().getSelectedObjects();
                String selectedItem = ((selected.length == 0) ? "null" : (String) selected[0]);

                if (selectedItem.equals("Android")) {

                    appP.setVisible(false);
                    browserL.setText("AVD");
                    browserCB.removeAllItems();
                    browserCB.addItem("Nexus_S_API_19");
                    browserCB.addItem("Galaxy_Nexus_API_19");

                }
                if (selectedItem.equals("iOS")) {

                    appP.setVisible(true);
                    browserL.setText("Simulator");
                    browserCB.removeAllItems();
                    browserCB.addItem("iPhone 6 (9.1)");
                    browserCB.addItem("iPhone 6 (9.0)");

                }
                if (selectedItem.equals("Desktop")) {

                    appP.setVisible(false);
                    browserL.setText("Browser");
                    browserCB.removeAllItems();
                    browserCB.addItem("Firefox");
                    browserCB.addItem("Chrome");
                    browserCB.addItem("Safari");
                }
                pack();
            }
        });
        browserCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object selected[] = e.getItemSelectable().getSelectedObjects();
                VD = ((selected.length == 0) ? "null" : (String) selected[0]);
            }
        });

        appCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object selected[] = e.getItemSelectable().getSelectedObjects();
                app = ((selected.length == 0) ? "null" : (String) selected[0]);
            }
        });
        scriptCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object selected[] = e.getItemSelectable().getSelectedObjects();
                script = ((selected.length == 0) ? "null" : (String) selected[0]);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
