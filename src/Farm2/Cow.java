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
public class Cow extends Creature {
    private int size;

private ImageIcon ii;
private Image img;

public Cow(int size) {
super();
this.size = size;

this.ii = new ImageIcon(getClass().getResource("/images/cow.png"));
this.img = ii.getImage();
}
 public Cow(int x, int y) {
    this(50);  
    this.x = 300;
    this.y = 100;
    vx = -3;
    vy = -3;
    }
public Cow() {
    this(50);
   this.size = size * 2;
}

@Override
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}

}
