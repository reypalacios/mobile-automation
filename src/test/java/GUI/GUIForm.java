package GUI;

import features.CucumberRunner;
import org.junit.runner.JUnitCore;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by rpalacios on 11/20/15.
 */
public class GUIForm extends JFrame{

    private JPanel rootpanel;
    private JButton runB;
    private JLabel browserL;
    private JComboBox browserCB;

    public GUIForm() {

        super("Run a Test");
        setContentPane(rootpanel);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        runB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{

                    FileOutputStream out = new FileOutputStream(System.getProperty("user.dir")+"/target/classes/config.properties");
                    Properties properties = new Properties();
                    properties.setProperty("screenshotsPath", "screenshots/");
                    properties.setProperty("browser", (String) browserCB.getSelectedItem());
                    properties.store(out, null);
                    out.close();

                    new JUnitCore().run(CucumberRunner.class);

                    //JOptionPane.showConfirmDialog(GUIForm.this, "Test is running");
                }
                catch (IOException ioe){
                    JOptionPane.showMessageDialog(GUIForm.this,ioe.getMessage());
                }
            }
        });


    setVisible(true);

    }

}
