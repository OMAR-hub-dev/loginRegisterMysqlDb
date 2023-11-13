import db.MyJDBC;
import guis.LoginFormGUI;

import javax.swing.*;

public class AppLaucher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                // instantiate a LoginFormGUI obj and make it visible
                new LoginFormGUI().setVisible(true);

                // check user test
//                System.out.println(MyJDBC.checkUser("username2546"));

                // check register test
//                System.out.println(MyJDBC.register("username4", "password"));

                // check validate login test
//                System.out.println(MyJDBC.validateLogin("username1234", "password"));
            }
        });
    }


}
