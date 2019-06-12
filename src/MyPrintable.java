
import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prateek
 */
public class MyPrintable implements Printable{

    Image im;
    public MyPrintable(Image im){
        this.im = im;
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        graphics.drawImage(im, 0, 0, null);
        return Printable.PAGE_EXISTS;
    }
    
}
