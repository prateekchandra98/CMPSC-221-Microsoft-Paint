
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prateek
 */
public class FreeDraw extends Shape{
    
    //arraylist of previous points of the mouse
    public ArrayList <Point> alOriginal = new ArrayList();
    
    @Override
    public Shape newShape(){
        return new FreeDraw();
    }
    
    
    public void drawShape(int posx, int posy, int w, int h, Color c, Graphics g, int quadrant, int thickness ,boolean dashed, boolean filled, float alpha, int textureGradient,Color[]cc, File f, int[]pDimensions){
        
        x = posx;
        y = posy;
        width = Math.abs(w);
        height = Math.abs(h);
        color=c;
        dash = dashed;
        thick = thickness;
        qd = quadrant;
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
        
        BasicStroke bs;
        if (dashed){
            
            float[] fa = {10, 10, 10};
            bs = new BasicStroke(thickness, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,10, fa, 10);
            g2d.setStroke(bs);
                        
        }else{  
            
            bs = new BasicStroke(thickness);
            g2d.setStroke(bs);
            
        } 
        //g2d.setStroke(bs);
        
        if(alOriginal.size() !=0){
            
            
            
            g2d.drawLine(alOriginal.get(alOriginal.size()-1).x, alOriginal.get(alOriginal.size()-1).y, width, height);
        }
        
        alOriginal.add(new Point(width,height));
    }
    
    public void redraw(Graphics g){
        
        for (int i = 1; i < alOriginal.size(); i++){
            
            int oldx = alOriginal.get(i-1).x;
            int oldy = alOriginal.get(i-1).y;
            int newx = alOriginal.get(i).x;
            int newy = alOriginal.get(i).y;
            
            Graphics2D g2d = (Graphics2D)g;
            AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha1);
            g2d.setComposite(ac);
        
        if (paint() != null){
            g2d.setPaint(paint());
        }
            
        if (dash){
            
            float[] fa = {10, 10, 10};
            BasicStroke bs = new BasicStroke(thick, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,10, fa, 10);
            g2d.setStroke(bs);
            g.drawLine(oldx, oldy, newx, newy);
        }else{  
            
            BasicStroke bs = new BasicStroke(thick);
            g2d.setStroke(bs);
            g.drawLine(oldx, oldy, newx, newy);
           
        }
            
            
            
            
            
            
        }   
    }
    
   
    
    
    
}
