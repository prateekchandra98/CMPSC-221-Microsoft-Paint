
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
public class MyFreeDrawButton extends JButton{
    public void paint(Graphics g){
      super.paint(g);
      g.drawArc(4, this.getHeight()-20, this.getWidth()/4, this.getHeight()-10, 180, -90);
      g.drawArc(this.getWidth()/4-15, this.getHeight()-20, this.getWidth()/4, this.getHeight()-10, 0, 90);
      g.drawArc(this.getWidth()/4+5, this.getHeight()-20, this.getWidth()/4, this.getHeight()-10, -180, 90);
      g.drawArc(this.getWidth()/4+5, this.getHeight()-20, this.getWidth()/4, this.getHeight()-10,0, -90);
      g.drawArc(this.getWidth()/4+25, this.getHeight()-20, this.getWidth()/4, this.getHeight()-10, 180, -90);
      g.drawArc(this.getWidth()/4+25, this.getHeight()-20, this.getWidth()/4, this.getHeight()-10, 0, 90);
      g.drawArc(this.getWidth()/4+45, this.getHeight()-20, this.getWidth()/4, this.getHeight()-10, -180, 90);
    }
}
