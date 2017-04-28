/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMS;
/**
 *
 * @author M.Arslan Hp
 */
public class PriceList extends RItems{
    
    public void show()
    {
         iprice[3]= Double.parseDouble(lblSalad);
         double pfries = Double.parseDouble(TxtCostOfSalad.getText());
        if(CheckBxSalad.isSelected())
        {
           double qfries = Double.parseDouble(TxtSalad.getText());
           double netprice = (qfries*iprice[3])+pfries;
            String cfries = String.format("%.2f",netprice);
           TxtCostOfSalad.setText(cfries);
    }
}

            
