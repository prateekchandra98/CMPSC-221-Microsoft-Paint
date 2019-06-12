
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
public class MyNewPageButton extends JButton{
    
    public void paint(Graphics g){
      super.paint(g);
      Color cc = new Color(223, 183, 0);
      g.setColor(Color.white);

      g.fillRect(1, 1, this.getWidth()-2, this.getHeight()-2);
      
      g.setColor(Color.black);
      g.drawRect(1, 1, this.getWidth()-2, this.getHeight()-2);
      
      int[] a = {this.getWidth()-10, this.getWidth()-10, this.getWidth()-2};
      int[] b = {1,9,9 };
      g.drawPolygon(a, b, 3);
      
    }
    
}
