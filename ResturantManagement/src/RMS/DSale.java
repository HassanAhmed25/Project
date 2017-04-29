/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMS;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JTextArea;
/**
 *
 * @author M.Arslan Hp
 */
public class DSale{
    public void showsale(JTextArea jt)
    {
        Total obj = new Total();
        
        //ArrayList arl = new ArrayList();
        for(int i =0; i <= Total.arr.size(); i++ )
        {
//          for (int i = 0; i < obj.arr.size(); i++) {
//          arl.append((String) obj.arr.get(i));
         //arl.add(i,obj);
         jt.setText(Total.arr.get(i).toString());
          //jt.setText(arl.get(i).toString());
    }
}
//      String ArrayData=null;
//        ArrayList listData = new ArrayList();
//        foreach (String listData in obj.arr)
//
//        {
//
//        ArrayData = ArrayData + ", " + obj.arr;
//
//        }
//
//   jt.setText(ArrayData); 
    }
