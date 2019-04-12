/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farm2;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 628953
 */
public class Barn  {
private int size;
private ImageIcon ii;
private Image img;
 
 


public Barn(int size) {
this.size = size;
this.ii = new ImageIcon(getClass().getResource("/images/barn.png"));
this.img = ii.getImage();
}

 Barn(int x, int y) {
     this(200);   
     
   
    }

    Barn() {
        this(200); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, 0, 0, size, size, null);

}
}
