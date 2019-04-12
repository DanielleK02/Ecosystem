/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farm2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 628953
 */
public class Chicken extends Creature {
private int size;

private ImageIcon ii;
private Image img;

public Chicken(int size) {
super();
this.size = size;

this.ii = new ImageIcon(getClass().getResource("/images/chicken.png"));
this.img = ii.getImage();
}
 public Chicken(int x, int y) {
    this(50);  
    this.x = -100;
    this.y = 200;
    vx = 4;
    vy = 3;
    }
public Chicken() {
    this(50);
}

@Override
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}

}
