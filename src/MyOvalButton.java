
import java.awt.Color;
import java.awt.Graphics;
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
public class MyOvalButton extends JButton{
  public void paint(Graphics g){
      super.paint(g);
      //g.setColor(Color.blue);
      g.drawOval(6,6,this.getWidth()-12,this.getHeight()-12);
}  
}
