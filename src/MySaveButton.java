

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
public class MySaveButton extends JButton{
    public void paint(Graphics g){
      super.paint(g);
      Color cc = new Color(2, 2, 120);
      g.setColor(cc);
      g.setColor(cc);

      g.fillRect(1, 1, this.getWidth()-1, this.getHeight()-2);
      g.setColor(Color.lightGray);
      g.fillRect(2, 2, this.getWidth()-4, (this.getHeight()/2)-2);
      g.setColor(Color.gray);
      g.drawLine(4, 4, this.getWidth()-6, 4);
      g.drawLine(4, 8, this.getWidth()-6, 8);
    }
}
