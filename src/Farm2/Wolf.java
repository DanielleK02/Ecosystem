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
public class Wolf extends Creature {
private int size;

private ImageIcon ii;
private Image img;

public Wolf(int size) {
super();
this.size = size;

this.ii = new ImageIcon(getClass().getResource("/images/wolf.png"));
this.img = ii.getImage();
}

public Wolf (int x, int y) {
    this(95);
    this.x = 600;
    this.y = 200;
    vx = -2;
    vy = 2;
}

public Wolf() {
    this(100, 100);
}


@Override
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

    } 
}

