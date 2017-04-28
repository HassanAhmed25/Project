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
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class PriceList extends RItems{
    
    public void salad(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel lblprice )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(lblprice.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
    public void fries(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
     public void onion(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
       public void chickensalad(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
         public void russiansalad(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
           public void chickenburger(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
             public void tea(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
               public void zinger(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
                 public void cola(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
                   public void beef(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
      public void chickensandwich(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
           public void fishsandwich(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
           public void coffee(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
                  public void juice(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }   
                  public void water(JCheckBox cbx , JTextField Salad, JTextField CostoFSalad, JLabel price )
    {        Double a = Double.parseDouble(Salad.getText());
        Double b = Double.parseDouble(CostoFSalad.getText());
          double  i = Double.parseDouble(price.getText());
        if(cbx.isSelected())
        {
           double netprice = (a*i)+b;
            String cfries = String.format("%.2f",netprice);
           CostoFSalad.setText(cfries);
      }
    }
}

            
