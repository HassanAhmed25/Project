/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMS;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author M.Arslan Hp
 */
public class UserPass {
    String FUser = "admin"  ;
    String FPass= "admin12";
    public void admin(JTextField auser, JPasswordField apass){
       String password = apass.getText();
        String username = auser.getText();
        
        if (username.equals("admin")&& password.equals("admin12"))
        {
            auser.setText("");
            apass.setText("");
            RItems r = new RItems();
            r.setVisible(true);
        }
        else
        {
           
            JOptionPane.showMessageDialog(null,"Username or password is invalid");
        }  
    }
    public void user(JTextField suser, JPasswordField spass){
        String password = spass.getText();
        String username = suser.getText();
   
        
        if (username.equals(FUser)&& password.equals(FPass))
        {
              FUser = username;
              FPass = password;
            suser.setText("");
            spass.setText("");
            AdminForm r = new AdminForm();
            r.setVisible(true);
          
           
        }
        else
        {
           
            JOptionPane.showMessageDialog(null,"Username or password is invalid");
        }  
    }
 
    
}
