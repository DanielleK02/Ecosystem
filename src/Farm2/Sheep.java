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
public class Sheep extends Creature {
private int size;

private ImageIcon ii;
private Image img;

public Sheep(int size) {
super();
this.size = size;

this.ii = new ImageIcon(getClass().getResource("/images/sheep.png"));
this.img = ii.getImage();
}

public Sheep (int x, int y) {
    this(50);
    this.x = 600;
    this.y = 700;
    vx = -1;
    vy = 2;
}

public Sheep() {
    this(50, 50);
}


@Override
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

    } 
}

