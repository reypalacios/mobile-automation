package GUI;

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
    public static String AVD;
    public static String platformName;
    private JPanel rootpanel;
    private JButton runB;
    private JLabel browserL;
    private JComboBox browserCB;
    public JComboBox launchonCB;
    private JLabel launchonL;
    private JPanel browserP;
    Logger logger = Logger.getLogger(this.getClass());

    public GUIForm() {

        super("Run a Test");
        setContentPane(rootpanel);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        runB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    launchOn = (String) launchonCB.getSelectedItem();
                    AVD = (String) browserCB.getSelectedItem();

                    logger.info("------------ Environmental Configurations ------------");
                    logger.info("OS = "+launchOn);
                    logger.info("AVD = "+AVD);
                    logger.info("------------------------------------------------------");

                    FileOutputStream out = new FileOutputStream(System.getProperty("user.dir")+"/target/classes/config.properties");
                    Properties properties = new Properties();
                    properties.setProperty("screenshotsPath", "screenshots/");
                    //properties.setProperty("laucher", (String) launcherCB.getSelectedItem());
                    properties.setProperty("browser", (String) browserCB.getSelectedItem());
                    properties.store(out, null);
                    out.close();

                    (new Runnable()).start();

                    //JOptionPane.showConfirmDialog(GUIForm.this, "Test is running");
                }
                catch (IOException ioe){
                    JOptionPane.showMessageDialog(GUIForm.this,ioe.getMessage());
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

                    browserL.setText("AVD");
                    browserCB.removeAllItems();
                    browserCB.addItem("Nexus_S_API_19");
                    browserCB.addItem("Galaxy_Nexus_API_19");

                }
                if (selectedItem.equals("iOS")) {

                    browserL.setText("Device");
                    browserCB.removeAllItems();
                    browserCB.addItem("iPhone");
                    //browserCB.addItem("Galaxy_Nexus_API_19");

                }
                if(selectedItem.equals("Desktop")) {

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
                AVD = ((selected.length == 0) ? "null" : (String) selected[0]);
            }
        });
    }

}
