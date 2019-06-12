
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prateek
 */
public class Oval extends Shape{
    
    public void drawShape(int posx, int posy, int w, int h, Color c, Graphics g, int q, int thickness, boolean dashed, boolean filled, float alpha, int textureGradient, Color[]cc, File f, int[]pDimensions){
        
        x = posx;
        y = posy;
        width = w;
        height = h;
        color=c;
        dash = dashed;
        qd = q;
        thick = thickness;
        fill = filled;
        alpha1 = alpha;
        
        textgrad = textureGradient;
        cColor[0]=cc[0];
        cColor[1]=cc[1];
        fi = f;
        panelDimensions[0] = pDimensions[0];
        panelDimensions[1] = pDimensions[1];
        
        Graphics2D g2d = (Graphics2D)g;
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha1);
        g2d.setComposite(ac);
        
        
        if (paint() != null){
            g2d.setPaint(paint());
        }
        
        if (dashed){
            //Graphics2D g2d = (Graphics2D)g;
            float[] fa = {10, 10, 10};
            BasicStroke bs = new BasicStroke(thickness, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,10, fa, 10);
            g2d.setStroke(bs);
            g2d.drawOval(posx,posy,w,h);
        }else{  
            //Graphics2D g2d = (Graphics2D)g;
            BasicStroke bs = new BasicStroke(thickness);
            g2d.setStroke(bs);
            if (fill){
                g2d.fillOval(posx,posy,w,h);
            }else{
                g2d.drawOval(posx,posy,w,h);
            }
        }
        
        
        
        
    }
    public Shape newShape(){
        return new Oval();
    }
}
