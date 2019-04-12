/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farm2;

import java.awt.Graphics;
import java.awt.Image;
import javafx.scene.CacheHint;
import javax.swing.ImageIcon;

/**
 *
 * @author 628953
 */
public class Farmer extends Creature {
private int size;
private ImageIcon ii;
private Image img;
  

public Farmer(int size) {
super();
this.size = size;
this.ii = new ImageIcon(getClass().getResource("/images/farmer.png"));
this.img = ii.getImage();
}

 Farmer(int x, int y) {
     this(100); 
     this.x = 100;
     this.y = 100;
     vx = 0;
     vy = 0;
    }

    Farmer() {
        this(100, 100); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

    
    }

    

   
    
}
