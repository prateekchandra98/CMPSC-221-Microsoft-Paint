
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
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
public class Text extends Shape{
    
    String text;
    
    @Override
    public Shape newShape(){
        return new Text(text);
    }
    
    @Override
    public void drawShape(int posx, int posy, int w, int h, Color c, Graphics g, int quadrant, int thickness, boolean dashed, boolean filled, float alpha, int textureGradient, Color[]cc, File f,int[]pDimensions){
        x = posx;
        y = posy;
        width = w;
        height = h;
        color=c;
        dash = dashed;
        thick = thickness;
        qd = quadrant;
        alpha1 = alpha;
        textgrad = textureGradient;
        cColor[0]=cc[0];
        cColor[1]=cc[1];
        //gr = g;
        fi = f;
        panelDimensions[0] = pDimensions[0];
        panelDimensions[1] = pDimensions[1];
        
        Graphics2D g2d = (Graphics2D) g;
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha1);
        g2d.setComposite(ac);
        
        
        if (paint() != null){
            g2d.setPaint(paint());
        }
        
        Font font = new Font("Arial", Font.BOLD, 10 + (thick/2)); //setting the font of the text and the size
        g.setFont(font);//sends it to graphics
        
        if (quadrant == 4){
            g2d.drawString(text, x+width, y+height);     
        }else if (quadrant == 3){
            g2d.drawString(text, x, y+height);   
        }else if (quadrant==2){
            g2d.drawString(text, x, y);
        }else{
            g2d.drawString(text, x+width, y);
        }   
    }
    
    public Text(String str){
        text = str;
    }
}
