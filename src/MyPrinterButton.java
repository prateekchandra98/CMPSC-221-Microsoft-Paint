
import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Array;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prateek
 */
public class MyPrinterButton extends JButton{
    public void paint(Graphics g){
      super.paint(g);
      //Color cc = new Color(223, 183, 0);
      g.setColor(Color.black);
      g.drawRect((this.getWidth()/6),(this.getHeight()/3)-5, (4*(this.getWidth()/6)+2), 2*(this.getHeight()/3)-10);
      g.fillRect((this.getWidth()/6)-3,this.getHeight()/3, 24, 2*(this.getHeight()/3)-5);
      g.setColor(Color.gray);
      g.fillRect((this.getWidth()/6),(this.getHeight()/3)-5, (4*(this.getWidth()/6)+2), 2*(this.getHeight()/3)-10);
      int[] xCoordinates = {(this.getWidth()/6)+1,(this.getWidth()/6)+(4*(this.getWidth()/6)+2)-2,24,(this.getWidth()/6)-3};
      int[] yCoordinates = {(this.getHeight()/3)+(2*(this.getHeight()/3)-5)-3,(this.getHeight()/3)+(2*(this.getHeight()/3)-5)-3,this.getHeight()-1,this.getHeight()-1};      
      g.setColor(Color.white);
      g.fillPolygon(xCoordinates, yCoordinates, 4);
      g.setColor(Color.black);
      g.drawPolygon(xCoordinates, yCoordinates, 4);
    }
    
}
