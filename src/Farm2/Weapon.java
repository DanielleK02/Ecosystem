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
public class Weapon extends Creature {
private int size;
private ImageIcon ii;
private Image img;


public Weapon(int size) {
    super();
    this.size = size;
    this.ii = new ImageIcon(getClass().getResource("/images/weapon.png"));
    this.img = ii.getImage();
}

 Weapon(int x, int y) {
     this(25);   
 
        
     super.setVy(0);
    }
Weapon() {
    this(100, 100);
    
}
     
@Override
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}

   
}
