
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
public class MyOpenButton extends JButton{
     public void paint(Graphics g){
      super.paint(g);
      Color cc = new Color(223, 183, 0);
      g.setColor(cc);

      g.fillRect(1, 1, this.getWidth()-1, this.getHeight()-2);
      
      g.setColor(Color.gray);
      g.drawLine(1, 1, this.getWidth()-8, 8);
      g.drawLine(this.getWidth()-8, 8,this.getWidth()-8 , this.getHeight()-2);
      g.drawRect(1, 1, this.getWidth()-2, this.getHeight()-2);
    }
}
