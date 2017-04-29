/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMS;
import javax.swing.JTextField;
import java.util.ArrayList;
/**
 *
 * @author M.Arslan Hp
 */
public class Total {
    public static ArrayList arr = new ArrayList();
    int a = 0;
    public void showtotal(JTextField CSalad, JTextField CBurger, JTextField CDrinks, JTextField TTax, JTextField TSTotal, JTextField TTotal)
    {
        double [] price = new double [3]; 
         price[0]= Double.parseDouble(CSalad.getText());
        price[1]= Double.parseDouble(CBurger.getText());
        price[2]= Double.parseDouble(CDrinks.getText());
        
        double pricetotal = price[0]+price[1]+price[2];
        String ptax = String.format("PKR %.2f", pricetotal/100);
        TTax.setText(ptax);
        
        double subtotal = pricetotal;
        String itotal = String.format("PKR %.2f",subtotal);
        TSTotal.setText(itotal);
        
        double atotal = pricetotal;
        String stotal = String.format("PKR %.2f",atotal+(atotal/100));
        TTotal.setText(stotal);
        a++;
        for (int i = 0; i < a; i++) {
            
          arr.add(atotal);
        
        }
        
    }
    
}
