/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMS;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
/**
 *
 * @author M.Arslan Hp
 */
public class SalesmanInfo extends UserPass {
    
    public void show(JTextField ja, JTextField jp)
    {
       ja.setText(this.FUser);
      
       jp.setText(this.FPass);  
    }
    public void update(JTextField ja, JTextField jp)
    {
        UserPass obj = new UserPass();   
    }
   
    
   
}
