
import java.awt.Color;

import java.awt.Graphics;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prateek
 */

public class Shape implements Serializable{
    
    float gradArray[] = {0.5f, 1.0f};
    int x, y, width, height, qd, thick, textgrad;
    Graphics gr;
    Color color;
    boolean dash;
    boolean fill;
    float alpha1;
    Color cColor[] = new Color[2];
    File fi;
    int[]panelDimensions = new int[2];
    
    //method which set the values of the parameters to the instance variables of this class
    public void drawShape(int posx, int posy, int w, int h, Color c, Graphics g, int quadrant, int thickness, boolean dashed, boolean filled, float alpha, int textureGradient, Color[]cc, File f, int[]pDimensions){
        x = posx;
        y = posy;
        width = w;
        height = h;
        color=c;
        qd = quadrant;
        thick = thickness;
        dash = dashed;
        fill = filled;
        alpha1 = alpha;
        
        textgrad = textureGradient;
        cColor[0]=cc[0];
        cColor[1]=cc[1];
        
        fi = f;
        panelDimensions[0] = pDimensions[0];
        panelDimensions[1] = pDimensions[1];
        

    }
    
    public Shape newShape(){
        
        return new Shape();
    }
    
    public ArrayList<Point> getPreviousPoints(){
        return new ArrayList();
    }
    
    public void redraw(Graphics g){
        
    }
    
    public Paint paint(){
        
        
        if (textgrad == 1){
            return new LinearGradientPaint(x+((width)/2), 0, x+((width)/2), y+((height)/2), gradArray, cColor );
        
        }else if (textgrad == 2){
            return new RadialGradientPaint(x+(width/2), y+(height/2), 100, gradArray ,cColor);
           
        }else if (textgrad == 3){
            
            TexturePaint tp;
            ImageIcon image = new ImageIcon(fi.toString());
            
            BufferedImage bi = new BufferedImage(panelDimensions[0],panelDimensions[1],BufferedImage.TYPE_4BYTE_ABGR);
            java.awt.Rectangle r = new Rectangle(100,100);
            Graphics big = bi.createGraphics();
            big.drawImage(image.getImage(),0,0,panelDimensions[0],panelDimensions[1],null);

            tp= new TexturePaint(bi,r);

            return tp;
        }else{ 
            return null;
        }
        
    }
}

